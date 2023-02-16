package com.model;

public class ValidStudents {
	private int studId;
	private String firstName;
	private int passCode;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getPassCode() {
		return passCode;
	}
	public void setPassCode(int passCode) {
		this.passCode = passCode;
	}
	
	public ValidStudents(int studId, String firstName, int passCode) {
		super();
		this.studId = studId;
		this.firstName = firstName;
		this.passCode = passCode;
	}
	
	@Override
	public String toString() {
		return "ValidStudents [studId=" + studId + ", firstName=" + firstName + ", passCode=" + passCode + "]";
	}
	
	public ValidStudents() {
		super();
		// TODO Auto-generated constructor stub
	}
}
