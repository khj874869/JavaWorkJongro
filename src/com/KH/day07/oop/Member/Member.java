package com.KH.day07.oop.Member;

public class Member {
private String memberId;
private String memberPw;
private String memberEmail;
private String memberAddress;
public Member() {
	
}//생성자
public Member(String memberId,String memberPw,String memberEmail,String memberAddress) {
	this.memberId = memberId;
	this.memberPw = memberPw;
	this.memberEmail = memberEmail;
	this.memberAddress = memberAddress;
	
}
//getter
public String getMemberId() {
	return this.memberId;
}
//Setter
public void setMemberId(String memberId) {
	this.memberId = memberId;
}
public String getMemberPw() {
	return this.memberPw;
}
public void setMemberPw(String memberPw) {
	this.memberPw = memberPw;
}
public String getMemberEmail() {
	return this.memberEmail;
}
public void setMemberEmail(String memberEmail) {
	this.memberEmail = memberEmail;
}
public String getMemberAddress() {
	return this.memberAddress;
}
public void setMemberAddtess(String memberAddress) {
	this.memberAddress = memberAddress;
}
}
