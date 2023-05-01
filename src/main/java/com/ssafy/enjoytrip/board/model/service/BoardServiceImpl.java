package com.ssafy.enjoytrip.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.board.model.Board;
import com.ssafy.enjoytrip.board.model.Comment;
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


	@Override
	public Board getBoardByNo(int boardNo) throws Exception {
		return boardMapper.selectBoard(boardNo);
	}


	@Override
	public void updateHit(int boardNo) throws Exception {
		boardMapper.updateHit(boardNo);
	}


	@Override
	public void modifyBoard(Board board) throws Exception {
		boardMapper.updateBoard(board);
		
	}


	@Override
	public void deleteBoard(int boardNo) throws Exception {
		boardMapper.deleteBoard(boardNo);
	}


	@Override
	public void writeComment(Comment comment) throws Exception {
		boardMapper.insertComment(comment);
	}


	@Override
	public List<Comment> listComment(int boardNo) throws Exception {
		return boardMapper.selectCommentByBoardId(boardNo);
	}


	@Override
	public void deleteComment(int commentNo) throws Exception {
		boardMapper.deleteComment(commentNo);
	}

}
