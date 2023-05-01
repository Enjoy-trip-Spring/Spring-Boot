package com.ssafy.enjoytrip.board.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.board.model.Board;
import com.ssafy.enjoytrip.board.model.Comment;

@Mapper	
public interface BoardMapper {
	// 목록
	List<Board> selectBoardAll() throws SQLException;
	
	// 등록
	void insertBoard(Board board) throws SQLException;
	
	Board selectBoard(int boardNo) throws SQLException;

	void updateHit(int boardNo) throws SQLException;
	
	// 수정
	void updateBoard(Board board) throws SQLException;

	// 삭제
	void deleteBoard(int boardNo) throws SQLException;

	// ================댓 글====================
	void insertComment(Comment comment) throws SQLException;

	List<Comment> selectCommentByBoardId(int boardNo) throws SQLException;

	void deleteComment(int commentNo) throws SQLException;
	
}
