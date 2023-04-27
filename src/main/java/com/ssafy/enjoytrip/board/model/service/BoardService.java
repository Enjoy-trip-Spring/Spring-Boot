package com.ssafy.enjoytrip.board.model.service;

import java.util.List;

import com.ssafy.enjoytrip.board.model.Board;

public interface BoardService {

	List<Board> boardList() throws Exception;

	void writeBoard(Board board) throws Exception;

}
