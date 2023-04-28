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
	<h1>상세 글 보기</h1>
	<table>
		<tr>
			<th>글 번호</th>
			<th>제 목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>내용</th>
			<th>작성 시간</th>
		</tr>
		<tr>
			<td>${board.boardNo}</td>
			<td>${board.boardTitle}</td>
			<td>${board.memberId}</td>
			<td>${board.hit}</td>
			<td>${board.boardContent}</td>
			<td>${board.createDate}</td>
		</tr>

	</table>
	<a href="${root}/board/list">글 목록</a>
	<a href="${root}/board/modify/${board.boardNo}" id="modify">글 수정</a>
	<a href="${root}/board/delete/${board.boardNo}" id="delete">글 삭제</a>
</body>
</html>
