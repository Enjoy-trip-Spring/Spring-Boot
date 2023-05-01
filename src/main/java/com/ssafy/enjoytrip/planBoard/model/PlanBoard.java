package com.ssafy.enjoytrip.planBoard.model;

public class PlanBoard {
	private int planBoardNo;
	private String planBoardTitle;
	private String planBoardContent;
	private String userId;
	private int hit;
	private String createDate;
	private int boardLike;
	private int boardCommentCnt;
	
	public int getPlanBoardNo() {
		return planBoardNo;
	}
	public void setPlanBoardNo(int planBoardNo) {
		this.planBoardNo = planBoardNo;
	}
	public String getPlanBoardTitle() {
		return planBoardTitle;
	}
	public void setPlanBoardTitle(String planBoardTitle) {
		this.planBoardTitle = planBoardTitle;
	}
	public String getPlanBoardContent() {
		return planBoardContent;
	}
	public void setPlanBoardContent(String planBoardContent) {
		this.planBoardContent = planBoardContent;
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
