package com.ssafy.enjoytrip.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.member.model.Member;
import com.ssafy.enjoytrip.member.model.service.MemberService;

@RestController
@RequestMapping("member")
public class MemberController {
	
	private MemberService memberService;
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	/**
	 * 회원가입 페이지 이동
	 * @return
	 */
//	@GetMapping("signUp")
//	public String signUp() {
//		return "/member/signUp";
//	}
	
	/**
	 * 회원가입 로직
	 * @param member
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("signUp")
	public void signUp(Member member) throws Exception {
		member = memberService.signUp(member);
	}
	
	/**
	 * 로그인 페이지 이동
	 * @return
	 */
//	@GetMapping("login")
//	public String login() {
//		return "/member/login";
//	}
	
	/**
	 * 로그인 로직
	 * @param member
	 * @param session
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("login")
	public ResponseEntity<Object> login(Member member, HttpSession session) throws Exception {
		Member memberInfo = memberService.login(member);
		System.out.println(memberInfo);
		if (memberInfo != null) {
			session.setAttribute("memberInfo", memberInfo);
			return new ResponseEntity<Object>(memberInfo, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(null, HttpStatus.CONFLICT);
		}
	}
	
	/**
	 * 로그아웃
	 * @param session
	 * @return
	 */
	@GetMapping("logout")
	public void logout(HttpSession session) {
		session.invalidate();
	}
	
	/**
	 * myPage이동
	 * @return
	 * @throws Exception 
	 */
	@GetMapping("myPage")
	public ResponseEntity<Object> myPage(HttpSession session, Model model) throws Exception {
		Member member = (Member) session.getAttribute("memberInfo");
		if (member == null) {
			return new ResponseEntity<Object>(member, HttpStatus.OK);
		}
		String memberId = member.getMemberId();
		member = memberService.getMemberInfo(memberId);
		model.addAttribute("member", member);
		return new ResponseEntity<Object>(null, HttpStatus.CONFLICT);
	}
	
//	/**
//	 * myPage에서 정보 수정 페이지로 이동
//	 * @param member
//	 * @return
//	 */
//	@GetMapping("myPageModify")
//	public String myPageModify(HttpSession session, Model model) throws Exception {
//		Member member = (Member) session.getAttribute("memberInfo");
//		if (member == null) {
//			return "redirect:/member/login";
//		}
//		String memberId = member.getMemberId();
//		member = memberService.getMemberInfo(memberId);
//		model.addAttribute("member", member);
//		return "/member/myPageModify";
//	}
	

	/**
	 * 정보 수정 후, myPage로 이동
	 * @param member
	 * @return
	 */
	@PutMapping("myPage")
	public void myPageModify(Member member) throws Exception {
		member = memberService.myPageModify(member);
	}
	
	/**
	 * myPage에서 회원 탈퇴
	 * @param member
	 * @param session
	 * @return
	 * @throws Exception 
	 */
	@DeleteMapping("myPage")
	public void myPage(Member member, HttpSession session) throws Exception {
		session.invalidate();
		memberService.deleteMember(member);
	}
}
