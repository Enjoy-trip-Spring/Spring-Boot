package com.ssafy.enjoytrip.attraction.model;

public class Attraction {

	// 기본 테이블 : attraction_info
	private int contentId; // PK가 되는 관광지 번호
	private int contentTypeId; // 관광지 타입 번호
	private String title; // 관광지명
	private String overview; // 관광지 설명 <- attraction_description
	private String addr1; // 주소
	private String tel; // 전화번호
	private String firstImage; // 이미지 경로
	private String firstImage2; // 예비 이미지 경로
	private int sidoCode; // 시도 코드
	private int gugunCode; // 구군 코드
	private String latitude; // 위도
	private String longitude; // 경도
	
	private String keyword; // 검색 키워드
	
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public int getContentTypeId() {
		return contentTypeId;
	}
	public void setContentTypeId(int contentTypeId) {
		this.contentTypeId = contentTypeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFirstImage() {
		return firstImage;
	}
	public void setFirstImage(String firstImage) {
		this.firstImage = firstImage;
	}
	public String getFirstImage2() {
		return firstImage2;
	}
	public void setFirstImage2(String firstImage2) {
		this.firstImage2 = firstImage2;
	}
	public int getSidoCode() {
		return sidoCode;
	}
	public void setSidoCode(int sidoCode) {
		this.sidoCode = sidoCode;
	}
	public int getGugunCode() {
		return gugunCode;
	}
	public void setGugunCode(int gugunCode) {
		this.gugunCode = gugunCode;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "Attraction [contentId=" + contentId + ", contentTypeId=" + contentTypeId + ", title=" + title
				+ ", overview=" + overview + ", addr1=" + addr1 + ", tel=" + tel + ", firstImage=" + firstImage
				+ ", firstImage2=" + firstImage2 + ", sidoCode=" + sidoCode + ", gugunCode=" + gugunCode + ", latitude="
				+ latitude + ", longitude=" + longitude + ", keyword=" + keyword + "]";
	}
	
}
