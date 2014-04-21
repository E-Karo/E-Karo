package com.ekaro.pojo;

import java.util.List;

public class Parent {
	private String firstName;
	private int idNumber;
	private List<Student> students;
    private boolean parentIsStudent;
    private String email;
    private String phoneNumber;
    private Address address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public boolean isParentIsStudent() {
		return parentIsStudent;
	}
	public void setParentIsStudent(boolean parentIsStudent) {
		this.parentIsStudent = parentIsStudent;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
    
    
}
