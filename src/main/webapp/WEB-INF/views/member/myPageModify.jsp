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
		<h1>MyPage 수정 페이지</h1>
	
		<h3>${member.memberName}님, 안녕하세요!</h3>
		
		<form action="myPageModify" method="post">
		<table>
			<tr>
				<th>이름</th>
				<td><input type="text" name="memberName" value="${member.memberName}"/></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="memberId" value="${member.memberId}" readonly/></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email" value="${member.email}"/></td>
			</tr>
			<tr>
				<th>핸드폰 번호</th>
				<td><input type="text" name="phone" value="${member.phone}"/></td>
			</tr>
		</table>
		<button>수정하기</button><br>
		<a href="myPage">돌아가기</a>		
		</form>		
	</div>
</body>
</html>