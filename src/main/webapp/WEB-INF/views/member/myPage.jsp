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
		<h1>MyPage 페이지</h1>
	
		<h3>${userInfo.userName}님, 안녕하세요!</h3>
		
		<table>
			<tr>
				<th>이름</th>
				<td>${memberInfo.userName}</td>
			</tr>
			<tr>
				<th>아이디</th>
				<td>${memberInfo.userId}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${memberInfo.email}</td>
			</tr>
			<tr>
				<th>핸드폰 번호</th>
				<td>${memberInfo.phone}</td>
			</tr>
		</table>		
	</div>
</body>
</html>