package com.ssafy.enjoytrip.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.board.model.Board;
import com.ssafy.enjoytrip.board.model.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper boardMapper;
	@Autowired
	public BoardServiceImpl(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}


	@Override
	public List<Board> boardList() throws Exception {
		return boardMapper.selectBoardAll();
	}


	@Override
	public void writeBoard(Board board) throws Exception {
		boardMapper.insertBoard(board);
	}

}
