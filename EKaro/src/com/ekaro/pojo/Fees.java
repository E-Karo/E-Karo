package com.ekaro.pojo;

import com.ekaro.helper.SchoolYear;
import com.ekaro.helper.Semester;

public class Fees {
	
	private double amount;
	private String description;
	private int year;
	private Semester semester;
	private SchoolYear schoolYear;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Semester getSemester() { 
		return semester;
	}
	public void setSemester(Semester semester) {
		this.semester = semester;
	}
	public SchoolYear getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(SchoolYear schoolYear) {
		this.schoolYear = schoolYear;
	}

}
