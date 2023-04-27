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
	<form action="${root}/board/write" method="post">
	<label for="boardTitle">제목 : </label>
	<input type="text" id="subject" name="boardTitle"/>
	<label for="boardContent">내용 : </label>
	<textarea id="boardContent" name="boardContent" rows="7"></textarea>
	<button>등록</button>
	</form>
</body>
</html>