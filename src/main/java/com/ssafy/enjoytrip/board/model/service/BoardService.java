package com.ssafy.enjoytrip.board.model.service;

import java.util.List;

import com.ssafy.enjoytrip.board.model.Board;
import com.ssafy.enjoytrip.board.model.Comment;

public interface BoardService {

	List<Board> boardList() throws Exception;

	void writeBoard(Board board) throws Exception;

	Board getBoardByNo(int boardNo) throws Exception;

	void updateHit(int boardNo) throws Exception;

	void modifyBoard(Board board) throws Exception;

	void deleteBoard(int boardNo) throws Exception;

	void writeComment(Comment comment) throws Exception;

	List<Comment> listComment(int boardNo) throws Exception;

	void deleteComment(int commentNo) throws Exception;

}
