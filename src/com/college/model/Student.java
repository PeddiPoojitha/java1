package com.college.model;

public class Student extends Person {
	public int studentId;
	public String department;
	public String courseName;
	public Student() {
		
	}
	public Student(int studentId, String department, String courseName) {
		super();
		this.studentId = studentId;
		this.department = department;
		this.courseName = courseName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void studentDetails() {
		System.out.println("----------------Student Details------------");
		System.out.println("Student Name:"+getName());
		System.out.println("Student Age:"+getAge());
		System.out.println("Student contactNumber:"+getContactNumber());
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Department:"+department);
		System.out.println("Student courseName:"+courseName);
	}

}
