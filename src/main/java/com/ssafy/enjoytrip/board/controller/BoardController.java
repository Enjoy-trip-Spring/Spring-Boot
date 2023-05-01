package com.ssafy.enjoytrip.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.enjoytrip.board.model.Board;
import com.ssafy.enjoytrip.board.model.service.BoardService;
import com.ssafy.enjoytrip.member.model.Member;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private BoardService boardService;
	@Autowired
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping("/list")
	public String list(Model model) throws Exception {
		List<Board> list = boardService.boardList();
		model.addAttribute("list", list);
		return "board/list";
	}
	
	@GetMapping("/write")
	public String writeForm() {
		return "board/write";
	}
	
	@PostMapping("/write")
	public String write(Board board, HttpSession session) throws Exception {
//		Member member = (Member) session.getAttribute("userInfo");
//		board.setUserId(member.getUserId());
		
		board.setMemberId("1234");
		boardService.writeBoard(board);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/view/{boardNo}")
	public String view(@PathVariable int boardNo, Model model) throws Exception {
		// 상세 페이지 접근 
		Board board = boardService.getBoardByNo(boardNo);
		boardService.updateHit(boardNo);
		model.addAttribute("board", board);
		return "board/view";
	}
	
	@GetMapping("/modify/{boardNo}")
	public String modify(@PathVariable int boardNo, Model model) throws Exception {
		System.out.println(boardNo);
		Board board = boardService.getBoardByNo(boardNo);
		model.addAttribute("board", board);
		return "board/modify";
	}
	
	@PostMapping("/modify")
	public String modify(Board board) throws Exception {
		board.setMemberId("1234");
		boardService.modifyBoard(board);
		return "redirect:/board/list";
	}
	
	@GetMapping("/delete/{boardNo}")
	public String delete(@PathVariable int boardNo) throws Exception {
		boardService.deleteBoard(boardNo);
		return "redirect:/board/list";
	}
}
