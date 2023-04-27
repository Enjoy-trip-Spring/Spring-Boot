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
	
		<form action="${root}/member/login" method="post">
			<label for="userId"> 아이디 </label>
			<input type="text" name="userId" id="userId"/><br>
			<label for="userPwd"> 비밀번호 </label>
			<input type="password" name="userPwd" id="userPwd"/><br>
			<button>로그인</button>
			<button type="reset">취소</button>
		</form>
	</div>
</body>
</html>