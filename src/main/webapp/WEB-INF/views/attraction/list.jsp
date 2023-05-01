<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.attraction-img {
		width: 100px;
		height: 150px;
	}
	table, tr, th, td {
		border: 1px solid black;
		border-collapse: collapse;
	}
</style>
<link rel="stylesheet" href="/resources/static/assets/css/attraction.css" />
</head>
<body>
	<div align="center">
		<h1>관광지 정보 페이지</h1>
		    <form action="" class="form">
		        <select name="sido-code" id="sido-code">
		            <option value="0" selected>검색할 지역 선택</option>
	                <option value="1">서울</option>
	                <option value="2">인천</option>
	                <option value="3">대전</option>
	                <option value="4">대구</option>
	                <option value="5">광주</option>
	                <option value="6">부산</option>
	                <option value="7">울산</option>
	                <option value="8">세종</option>
	                <option value="31">경기도</option>
	                <option value="32">강원도</option>
	                <option value="33">충청북도</option>
	                <option value="34">충청남도</option>
	                <option value="35">경상북도</option>
	                <option value="36">경상남도</option>
	                <option value="37">전라북도</option>
	                <option value="38">전라남도</option>
	                <option value="39">제주도</option>
		        </select>
		        <select name="content-type-id" id="content-type-id">
		            <option value="0" selected>관광지 유형</option>
		            <option value="12">관광지</option>
		            <option value="14">문화시설</option>
		            <option value="15">축제공연행사</option>
		            <option value="25">여행코스</option>
		            <option value="28">레포츠</option>
		            <option value="32">숙박</option>
		            <option value="38">쇼핑</option>
		            <option value="39">음식점</option>
		        </select>
		        <input type="search" placeholder="검색어" id="search-keyword" />
		        <button id="btn-search" type="button" onclick="searchAttraction()">검색</button>
		    </form>
		
	</div>
	
	    <!-- 지도를 표시할 div 입니다 -->
	    <div id="trip-main-container">
	        <div id="trip-main-rvWrapper">
	            <div id="trip-main-roadview"></div> <!-- 로드뷰를 표시할 div 입니다 -->
	            <div id="trip-main-close" title="로드뷰닫기" onclick="closeRoadview()"><span class="img"></span></div>
	        </div>
	        <div id="trip-main-mapWrapper">
	            <div id="trip-main-map"></div> <!-- 지도를 표시할 div 입니다 -->
	            <div id="trip-main-roadviewControl" onclick="setRoadviewRoad()"></div>
	        </div>
	    </div>
	    <!-- kakao map end -->
	
	    <div id="result" class="" style="display: none">
	        <div id="item-list">
	        </div>
	    </div>
	    <!-- 관광지 검색 end -->
	    
	    <div id="overview" style="display: none">
	    	<div id="overview-inner">
	    	</div>
	    </div>
	    
	    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=8c9a98c64f1f3ac2b761ffbe0e2e30e3"></script>
	    <script type="text/javascript" src="/resources/static/assets/js/attraction.js"></script>
</body>
</html>