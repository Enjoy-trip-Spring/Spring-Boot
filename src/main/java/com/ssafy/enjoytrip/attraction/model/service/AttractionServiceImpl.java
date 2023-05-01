package com.ssafy.enjoytrip.attraction.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.attraction.model.Attraction;
import com.ssafy.enjoytrip.attraction.model.mapper.AttractionMapper;

@Service
public class AttractionServiceImpl implements AttractionService {
	
	private AttractionMapper attractionMapper;
	public AttractionServiceImpl(AttractionMapper attractionMapper) {
		this.attractionMapper = attractionMapper;
	}
	@Override
	public List<Attraction> getAttractionList(Attraction attraction) throws Exception {
		return attractionMapper.selectAll(attraction);
	}

	

}
