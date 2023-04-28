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
	
		<h3>${memberInfo.userName}님, 안녕하세요!</h3>
		
		<table>
			<tr>
				<th>이름</th>
				<td>${member.userName}</td>
			</tr>
			<tr>
				<th>아이디</th>
				<td>${member.userId}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${member.email}</td>
			</tr>
			<tr>
				<th>핸드폰 번호</th>
				<td>${member.phone}</td>
			</tr>
		</table>
		
		<a href="myPageModify">내 정보 수정</a>		
	</div>
</body>
</html>