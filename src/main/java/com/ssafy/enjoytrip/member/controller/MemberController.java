package com.ssafy.enjoytrip.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		Member userInfo = memberService.login(member);
		System.out.println(userInfo);
		if (member != null) {
			session.setAttribute("userInfo", userInfo);
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
		Member memberInfo = (Member) session.getAttribute("userInfo");
		if (memberInfo == null) {
			return "redirect:/member/login";
		}
		String userId = memberInfo.getUserId();
		memberInfo = memberService.getMemberInfo(userId);
		model.addAttribute("memberInfo", memberInfo);
		return "/member/myPage";
	}
	
	/**
	 * myPage에서 내 정보 수정
	 * @param member
	 * @return
	 */
	@PutMapping("myPage")
	public String myPage(Member member) {
		return "redirect:/member/myPage";
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
