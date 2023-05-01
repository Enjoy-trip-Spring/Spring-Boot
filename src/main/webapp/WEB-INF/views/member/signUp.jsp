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
		<h1>회원가입 페이지</h1>
	
		<form action="signUp" method="post">
			<label for="memberName"> 이름 </label>
			<input type="text" name="memberName" id="memberName"/><br>
			<label for="memberId"> 아이디 </label>
			<input type="text" name="memberId" id="memberId"/><br>
			<label for="memberPwd"> 비밀번호 </label>
			<input type="text" name="memberPwd" id="memberPwd"/><br>
			<label for="memberPwd2"> 비밀번호 확인</label>
			<input type="text" name="memberPwd2" id="memberPwd2"/><br>
			<label for="email"> 이메일 </label>
			<input type="text" name="email" id="email"/><br>
			<label for="phone"> 핸드폰 번호 </label>
			<input type="text" name="phone" id="phone"/><br>
			<button>회원가입</button>
			<button type="reset">취소</button>
		</form>
	</div>
</body>
</html>