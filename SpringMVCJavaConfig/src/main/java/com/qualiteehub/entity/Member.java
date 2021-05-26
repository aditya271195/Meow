package com.qualiteehub.entity;

import java.util.List;


public class Member {

	
	private int memberId;
	private String memberName = "Aditya";
	private int age;
	private int weight;
	private String member;
	private List memberList;
	

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public List getMemberList() {
		return memberList;
	}

	public void setMemberList(List memberList) {
		this.memberList = memberList;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
}
