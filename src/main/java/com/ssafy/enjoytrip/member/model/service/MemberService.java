package com.ssafy.enjoytrip.member.model.service;

import com.ssafy.enjoytrip.member.model.Member;

public interface MemberService {

	Member signUp(Member member) throws Exception;

	Member login(Member member) throws Exception;

	Member getMemberInfo(String userId) throws Exception;

	Member myPageModify(Member member) throws Exception;

	void deleteMember(Member member) throws Exception;

}
