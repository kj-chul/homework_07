package com.kh.silsub2.student.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private int kTest;
	private int mTest;
	private int eTest;
	
	public Student() {
		
	}
	
	public Student(int grade, int classroom, String name) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public void setkTest(int kTest) {
		this.kTest = kTest;
	}
	
	public void setmTest(int mTest) {
		this.mTest = mTest;
	}
	
	public void seteTest(int eTest) {
		this.eTest = eTest;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getClassroom() {
		return classroom;
	}
	
	public int getkTest() {
		return kTest;
	}
	
	public int getmTest() {
		return mTest;
	}
	
	public int geteTest() {
		return eTest;
	}
	
	public String getName() {
		return name;
	}
	
	public double getAvarage() {
		double avg = (kTest + mTest + eTest) / 3;
		
		return avg;
		//return String.format("%.2", avg);
	}
	
//	public String information() {
//		return grade + "학년 " + classroom  + "반 " + stdNo + "번 " + name;
//	}
}
