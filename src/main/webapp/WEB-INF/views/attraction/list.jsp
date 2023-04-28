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
</head>
<body>
	<div align="center">
		<h1>관광지 정보 페이지</h1>
		
		<table>
			<tr>
				<th>관광지 이미지</th>
				<th>관광지명</th>
				<th>관광지 설명</th>
			</tr>
			<c:forEach var="list" items="${list}">
			<tr>
				<td><img class="attraction-img" src="${list.firstImage}"></td>
				<td>${list.title}</td>
				<td>${list.overview}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>