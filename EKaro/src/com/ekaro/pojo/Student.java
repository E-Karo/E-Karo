package com.ekaro.pojo;

import com.ekaro.helper.SchoolYear;

public class Student {
	
	private int admissionNumber;
	private School school;
	private String firstName;
	private String lastName;
	private Fees feesBalance;
	private SchoolYear schoolYear;
	public int getAdmissionNumber() {
		return admissionNumber;
	}
	public void setAdmissionNumber(int admissionNumber) {
		this.admissionNumber = admissionNumber;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Fees getFeesBalance() {
		return feesBalance;
	}
	public void setFeesBalance(Fees feesBalance) {
		this.feesBalance = feesBalance;
	}
	public SchoolYear getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(SchoolYear schoolYear) {
		this.schoolYear = schoolYear;
	}

}
