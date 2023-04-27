package com.ssafy.enjoytrip.member.model.service;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.member.model.Member;
import com.ssafy.enjoytrip.member.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	private MemberMapper memberMapper;
	public MemberServiceImpl(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}

	@Override
	public Member signUp(Member member) throws Exception {
		int success = memberMapper.insertMember(member);
		if (success == 1) {
			return member;
		} else {
			return null;
		}
	}

	@Override
	public Member login(Member member) throws Exception {
		return memberMapper.loginCheckMember(member);
	}

}
