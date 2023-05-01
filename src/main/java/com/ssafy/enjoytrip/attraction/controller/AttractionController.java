package com.ssafy.enjoytrip.attraction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.enjoytrip.attraction.model.service.AttractionService;

@Controller
@RequestMapping("/attraction")
public class AttractionController {
	
	private AttractionService attractionService;
	public AttractionController(AttractionService attractionService) {
		this.attractionService = attractionService;
	}

	@GetMapping("/list")
	public String list(Model model) throws Exception {
		model.addAttribute("list", attractionService.getAttractionList());
		return "attraction/list";
	}

}
