<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글 목록</h1>
	<table>
		<tr>
			<th>글 번호</th>
			<th>제 목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성 시간</th>
		</tr>
		<c:forEach var="board" items="${list}">
			<tr>
				<td>${board.boardNo}</td>
				<!-- detail page link -->
				<td><a href="#" data-no="${board.boardNo}"/>${board.boardTitle}</td>
				<td>${board.userId}</td>
				<td>${board.hit}</td>
				<td>${board.createDate}</td>
			</tr>
		</c:forEach>
	</table>
	<form id="form-no-param" method="get" action="${root}/board/view">
		<input type="hidden" id="boardNo" name="boardNo" value="">
	</form>
</body>
</html>