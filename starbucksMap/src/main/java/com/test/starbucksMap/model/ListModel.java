package com.test.starbucksMap.model;

public class ListModel {

	private String lId;			// 번호
	private String rCode;		// 지역코드
	private String tType;		// 지점타입
	private String lName;		// 지점명
	private String lAddr;		// 지점주소
	private String lLati;		// 위도
	private String lLong;		// 경도
	private String delFlag;		// 삭제여부
	private String creDate;		// 생성일
	private String chaDate;		// 생성일
	private String delDate;		// 생성일
	private String rText;		// 지역이름
	private String tText;		// 타입이름
	
	public String getlId() {
		return lId;
	}
	public void setlId(String lId) {
		this.lId = lId;
	}
	public String getrCode() {
		return rCode;
	}
	public void setrCode(String rCode) {
		this.rCode = rCode;
	}
	public String getrText() {
		return rText;
	}
	public void setrText(String rText) {
		this.rText = rText;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public String gettText() {
		return tText;
	}
	public void settText(String tText) {
		this.tText = tText;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getlAddr() {
		return lAddr;
	}
	public void setlAddr(String lAddr) {
		this.lAddr = lAddr;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	public String getCreDate() {
		return creDate;
	}
	public void setCreDate(String creDate) {
		this.creDate = creDate;
	}
	public String getChaDate() {
		return chaDate;
	}
	public void setChaDate(String chaDate) {
		this.chaDate = chaDate;
	}
	public String getDelDate() {
		return delDate;
	}
	public void setDelDate(String delDate) {
		this.delDate = delDate;
	}
	public String getlLati() {
		return lLati;
	}
	public void setlLati(String lLati) {
		this.lLati = lLati;
	}
	public String getlLong() {
		return lLong;
	}
	public void setlLong(String lLong) {
		this.lLong = lLong;
	}
}
