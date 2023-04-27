package com.ssafy.enjoytrip.member.model.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.member.model.Member;

@Mapper
public interface MemberMapper {

	int insertMember(Member member) throws SQLException;

}
