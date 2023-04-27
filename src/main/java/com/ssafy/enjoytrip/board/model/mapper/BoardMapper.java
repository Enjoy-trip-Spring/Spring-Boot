package com.ssafy.enjoytrip.board.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.board.model.Board;

@Mapper
public interface BoardMapper {
	// 목록
	List<Board> selectBoardAll() throws SQLException;
	
	// 등록
	void insertBoard(Board board) throws SQLException;
	
	// 수정
//	void updateBoard(int boardNo) throws SQLException;
//	
//	// 삭제
//	void deleteBoard(int boardNo) throws SQLException;
//	
//	// 상세
//	Board selectBoardByNo(int boardNo) throws SQLException;
}
