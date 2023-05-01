package com.ssafy.enjoytrip.board.model;

public class Comment {
	private int commentNo;
	private String memberId;
	private int boardNo;
	private String commentDate;
	private String commentContent;
	private int modifyCheck;
	private int commentLike;
	private int sueCnt;
	
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public int getModifyCheck() {
		return modifyCheck;
	}
	public void setModifyCheck(int modifyCheck) {
		this.modifyCheck = modifyCheck;
	}
	public int getCommentLike() {
		return commentLike;
	}
	public void setCommentLike(int commentLike) {
		this.commentLike = commentLike;
	}
	public int getSueCnt() {
		return sueCnt;
	}
	public void setSueCnt(int sueCnt) {
		this.sueCnt = sueCnt;
	}
}
