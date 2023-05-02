package com.ssafy.enjoytrip.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boardview")
public class BoardViewController {
	
	@GetMapping("/list")
	public String list() {
		return "redirect:list.html";
	}
}
