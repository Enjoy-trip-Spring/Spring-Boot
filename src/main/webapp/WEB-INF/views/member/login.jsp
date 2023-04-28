<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>로그인 페이지</h1>
	
		<form action="login" method="post">
			<label for="memberId"> 아이디 </label>
			<input type="text" name="memberId" id="memberId"/><br>
			<label for="memberPwd"> 비밀번호 </label>
			<input type="password" name="memberPwd" id="memberPwd"/><br>
			<button>로그인</button>
			<button type="reset">취소</button>
		</form>
	</div>
</body>
</html>