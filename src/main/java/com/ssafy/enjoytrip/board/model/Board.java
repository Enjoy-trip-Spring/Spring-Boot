package com.ssafy.enjoytrip.board.model;

public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardContent;	
	private String userId;	
	private int hit;
	private String createDate;	
	private int boardLike;	
	private int boardCommentCnt;
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getBoardLike() {
		return boardLike;
	}
	public void setBoardLike(int boardLike) {
		this.boardLike = boardLike;
	}
	public int getBoardCommentCnt() {
		return boardCommentCnt;
	}
	public void setBoardCommentCnt(int boardCommentCnt) {
		this.boardCommentCnt = boardCommentCnt;
	}	
}
