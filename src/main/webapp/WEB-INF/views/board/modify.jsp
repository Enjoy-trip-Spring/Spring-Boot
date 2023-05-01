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
	<h1>글 수정</h1>
	<form action="${root}/board/modify" method="post">
	<label for="memberId"> 작성자 : </label>
	<input type="text" id="memberId" name="memberId" value="${board.memberId}" readonly/>
	<label for="boardTitle">제목 : </label>
	<input type="text" id="boardTitle" name="boardTitle" value="${board.boardTitle}"/>
	<label for="boardContent">내용 : </label>
	<textarea id="boardContent" name="boardContent" rows="7">${board.boardContent}</textarea>
	<input type="hidden" name="boardNo" value="${board.boardNo}" />
	<button>수정</button>
	</form>
</body>
</html>