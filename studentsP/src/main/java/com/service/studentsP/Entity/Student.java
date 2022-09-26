package com.service.studentsP.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int rollNo;
	private String studentName;
	private String studentGender;
	private int studentAge;
	private String collegeName;
	
	
	public Student(int rollNo, String studentName, String studentGender, int studentAge, String collegeName) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentAge = studentAge;
		this.collegeName = collegeName;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentGender() {
		return studentGender;
	}


	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}


	public int getStudentAge() {
		return studentAge;
	}


	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", studentGender=" + studentGender
				+ ", studentAge=" + studentAge + ", collegeName=" + collegeName + "]";
	}
	
	
	}
	
	
	

	

