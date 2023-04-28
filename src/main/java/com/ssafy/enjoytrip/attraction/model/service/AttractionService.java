package com.ssafy.enjoytrip.attraction.model.service;

import java.util.List;

import com.ssafy.enjoytrip.attraction.model.Attraction;

public interface AttractionService {

	List<Attraction> getAttractionList() throws Exception;

}
