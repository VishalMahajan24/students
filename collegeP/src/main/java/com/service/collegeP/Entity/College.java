package com.service.collegeP.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {

	@Id
	private int collegeId;
	private String collegeName;
	private int totalStudents;
	
	public College(int collegeId, String collegeName, int totalStudents) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.totalStudents = totalStudents;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", totalStudents=" + totalStudents
				+ "]";
	}
	
	
	
}
