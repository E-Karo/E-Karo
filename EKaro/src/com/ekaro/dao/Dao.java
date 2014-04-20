package com.ekaro.dao;

import com.ekaro.pojo.School;
import com.ekaro.pojo.Student;

public interface Dao {

	public abstract void insertStudent(Student student);
	public abstract Student getStudentById();
	public abstract void deleteStudentBydId(int id);
	
	public abstract void insertSchoolByCode(long schoolCode);
	public abstract School getSchoolByCode(long schoolCode);
	public abstract void transferStudentByAdmission(long studentId, School fromSchool, School toSchool);
	
	
}
