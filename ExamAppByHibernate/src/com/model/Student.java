package com.model;

public class Student {
	private int studId;
	private String studFirstName;
	private String studLastName;
	private int marks;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudFirstName() {
		return studFirstName;
	}
	public void setStudFirstName(String studFirstName) {
		this.studFirstName = studFirstName;
	}
	public String getStudLastName() {
		return studLastName;
	}
	public void setStudLastName(String studLastName) {
		this.studLastName = studLastName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studId, String studFirstName, String studLastName, int marks) {
		super();
		this.studId = studId;
		this.studFirstName = studFirstName;
		this.studLastName = studLastName;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studFirstName=" + studFirstName + ", studLastName=" + studLastName
				+ ", marks=" + marks + "]";
	}
}
