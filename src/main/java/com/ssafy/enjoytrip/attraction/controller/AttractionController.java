package com.ssafy.enjoytrip.attraction.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.enjoytrip.attraction.model.Attraction;
import com.ssafy.enjoytrip.attraction.model.service.AttractionService;

@Controller
@RequestMapping("/attraction")
@CrossOrigin("*")
public class AttractionController {
	
	private AttractionService attractionService;
	public AttractionController(AttractionService attractionService) {
		this.attractionService = attractionService;
	}

	@GetMapping("/list")
	public String list() throws Exception {
		return "attraction/list";
	}
	
	@ResponseBody
	@GetMapping("/listAjax")
	public List<Attraction> list(Attraction attraction) throws Exception {
		System.out.println(attraction);
		if (attraction.getContentTypeId() == 0) attraction.setContentTypeId(12);
		if (attraction.getSidoCode() == 0) attraction.setSidoCode(1);
		if (attraction.getKeyword() == null) attraction.setKeyword("");		
		System.out.println("[Controller] : " + attraction);
		//ModelAndView mav = new ModelAndView();
		return attractionService.getAttractionList(attraction);
	} 

}
