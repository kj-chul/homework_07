package com.kh.silsub1.student.controller;

import java.util.Scanner;

import com.kh.silsub1.student.model.vo.Student;

public class StudentManager {
	
	private Scanner sc;
	private Student[] students;
	public StudentManager() {
		sc = new Scanner(System.in);
		students = new Student[3];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
	}
	
	//3학년 1반 1번 홍길동
	//4학년 3반 2번 유관순
	//2학년 7반 5번 윤봉길

	
	public void insertStudentData() {
		for(int i = 0; i < students.length; i++) {			
			System.out.print("학년을 입력 하세요 : ");
			students[i].setGrade(sc.nextInt());
			System.out.print("반을 입력 하세요 : ");
			students[i].setClassroom(sc.nextInt());
			System.out.print("번호를 입력 하세요 : ");
			students[i].setStdNo(sc.nextInt());
			System.out.print("이름을 입력 하세요 : ");	
			students[i].setName(sc.next());
		}
	}
	
	public void printStudentData() {
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].information());
		}
	}
}
