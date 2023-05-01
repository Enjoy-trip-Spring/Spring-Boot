package com.ssafy.enjoytrip.attraction.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.attraction.model.Attraction;

@Mapper
public interface AttractionMapper {

	List<Attraction> selectAll() throws SQLException;

}
