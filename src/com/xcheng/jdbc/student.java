package com.xcheng.jdbc;

public class student {
	private int sId;
	private String sName;
	private int age;
	private int cId;
	private int tId;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	@Override
	public String toString() {
		return "student [sId=" + sId + ", sName=" + sName + ", age=" + age + ", cId=" + cId + ", tId=" + tId + "]";
	}

}
