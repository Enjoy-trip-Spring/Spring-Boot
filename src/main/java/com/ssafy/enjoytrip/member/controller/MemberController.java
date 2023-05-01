package com.ssafy.enjoytrip.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.enjoytrip.member.model.Member;
import com.ssafy.enjoytrip.member.model.service.MemberService;

@Controller
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
	@GetMapping("signUp")
	public String signUp() {
		return "/member/signUp";
	}
	
	/**
	 * 회원가입 로직
	 * @param member
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("signUp")
	public String signUp(Member member) throws Exception {
		//System.out.println(member);
		member = memberService.signUp(member);
		if (member != null) {
			return "redirect:/member/login";
		} else {
			return "redirect:/member/signUp";
		}
	}
	
	/**
	 * 로그인 페이지 이동
	 * @return
	 */
	@GetMapping("login")
	public String login() {
		return "/member/login";
	}
	
	/**
	 * 로그인 로직
	 * @param member
	 * @param session
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("login")
	public String login(Member member, HttpSession session) throws Exception {
		Member memberInfo = memberService.login(member);
		System.out.println(memberInfo);
		if (memberInfo != null) {
			session.setAttribute("memberInfo", memberInfo);
			return "redirect:/";
		} else {
			return "redirect:/member/login";
		}
	}
	
	/**
	 * 로그아웃
	 * @param session
	 * @return
	 */
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	/**
	 * myPage이동
	 * @return
	 * @throws Exception 
	 */
	@GetMapping("myPage")
	public String myPage(HttpSession session, Model model) throws Exception {
		Member member = (Member) session.getAttribute("memberInfo");
		if (member == null) {
			return "redirect:/member/login";
		}
		String memberId = member.getMemberId();
		member = memberService.getMemberInfo(memberId);
		model.addAttribute("member", member);
		return "/member/myPage";
	}
	
	/**
	 * myPage에서 정보 수정 페이지로 이동
	 * @param member
	 * @return
	 */
	@GetMapping("myPageModify")
	public String myPageModify(HttpSession session, Model model) throws Exception {
		Member member = (Member) session.getAttribute("memberInfo");
		if (member == null) {
			return "redirect:/member/login";
		}
		String memberId = member.getMemberId();
		member = memberService.getMemberInfo(memberId);
		model.addAttribute("member", member);
		return "/member/myPageModify";
	}
	

	/**
	 * 정보 수정 후, myPage로 이동
	 * @param member
	 * @return
	 */
	@PostMapping("myPageModify")
	public String myPageModify(Member member, Model model) throws Exception {
		member = memberService.myPageModify(member);
		if (member != null) {
			return "redirect:/member/myPage";			
		} else {
			return "redirect:/member/myPageModify";
		}
	}
	
	/**
	 * myPage에서 회원 탈퇴
	 * @param member
	 * @param session
	 * @return
	 */
	@DeleteMapping("myPage")
	public String myPage(Member member, HttpSession session) {
		return "redirect:/";
	}
}
