package com.ssafy.enjoytrip.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.board.model.Comment;
import com.ssafy.enjoytrip.board.model.service.BoardService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	private BoardService boardService;
	@Autowired
	public CommentController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@PostMapping
	public List<Comment> writeComment(@RequestBody Comment comment) throws Exception {
		boardService.writeComment(comment);
		return boardService.listComment(comment.getBoardNo());
	}
	
	@DeleteMapping("/{boardNo}/{commentNo}")
	public List<Comment> deleteComment(@PathVariable int boardNo, @PathVariable int commentNo) throws Exception {
		boardService.deleteComment(commentNo);
		return boardService.listComment(boardNo);
	}
	
	@GetMapping("/{boardNo}")
	public List<Comment> listComment(@PathVariable int boardNo) throws Exception {
		return boardService.listComment(boardNo);
	}
}
