package com.ekaro.pojo;

public class School {
	
	private String schoolName;
	private long schoolCode;
	private String schoolType; // high school, college, university, etc.
	private Fees fees;
    private Address address;
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public long getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(long schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSchoolType() {
		return schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}
	public Fees getFees() {
		return fees;
	}
	public void setFees(Fees fees) {
		this.fees = fees;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}