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
	<button id="commentModifyBtn">수정</button>
	</form>
	
	<script type="text/javascript">
    	let commentModifyBtn = document.getElementById("commentModifyBtn");
    	commentModifyBtn.addEventListener('click', function() {
	    	let body = {
	    		"boardNo" : "${board.boardNo}",
	    		"memberId" : "1234",
	    		"boardTitle" : document.getElementById("boardTitle").value,
	    		"boardContent" : document.getElementById("boardContent").value
	    	};
	    	let config = {
	          method: "PUT",
	          headers: {
	            "Content-Type": "application/json",
	          },
	          body: JSON.stringify(body),
	        };
	        fetch(`${root}/board/modify`, config)
	          .then((response) => response.json());
	          /* .then((data) => makeCommentList(data)); */
    	});
    
    	function makeCommentList(list) {
    		let html = "";
    		for (let i = 0; i < list.length; i++) {
    			let comment = list[i];
    			html += `
    			<li>
    				<span>\${comment.commentNo}</span>
    				<span>\${comment.commentContent}</span>
    				<span>\${comment.memberId}</span>
    				<span>\${comment.commentDate}</span>
    				<span><a href="#1" onclick="commentDel(\${comment.commentNo})">삭제</a></span>
    			</li>`;
    		}
    		document.getElementById("commentUL").innerHTML = html;
    	}
    	
    	function commentDel(commentNo) {
	        let config = {
	          method: "DELETE",
	          headers: {
	            "Content-Type": "application/json",
	          },
	        };
	        fetch("${root}/comment/${board.boardNo}/" + commentNo, config)
	          .then((response) => response.json())
	          .then((data) => makeCommentList(data));
    	}
    
    	fetch("${root}/comment/${board.boardNo}")
	    .then((response) => response.json())
	    .then((data) => makeCommentList(data));
    
	</script>
</body>
</html>