package com.kh.silsub2.student.controller;

import java.util.Scanner;

import com.kh.silsub2.student.model.vo.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();			
		}
		
		int i = 0;
		boolean isYes = true;
		while(isYes) {
			
			System.out.print("학년을 입력 하세요 : ");
			int grade = sc.nextInt();
			System.out.print("반을 입력 하세요 : ");
			int classroom = sc.nextInt();
			System.out.print("이름을 입력 하세요 : ");
			String name = sc.next();
			System.out.print("국어 점수를 입력 하세요 : ");
			int kScore = sc.nextInt();
			System.out.print("영어 점수를 입력 하세요 : ");
			int eScore = sc.nextInt();
			System.out.print("수학 점수를 입력 하세요 : ");
			int mScore = sc.nextInt();
			
			students[i].setGrade(grade);
			students[i].setClassroom(classroom);
			students[i].setName(name);
			students[i].setkTest(kScore);
			students[i].seteTest(eScore);
			students[i].setmTest(mScore);
			
			if(students.length == i) {
				isYes = false;
			}
			
			System.out.print("계속 입력 하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);
			if(ch == 'n' || ch == 'N' ) {
				isYes = false;
			}
			
			i++;
		}
		
		
		for(i = 0; i < students.length; i++) {
			
			if(students[i].getName() == null) {				
				continue;	
			}
			
			System.out.println("학년 : " + students[i].getGrade());
			System.out.println("반 : " + students[i].getClassroom());
			System.out.println("이름 : " + students[i].getName());
			System.out.println("국어점수 : " + students[i].getkTest());
			System.out.println("수학점수 : " + students[i].getmTest());
			System.out.println("영어점수 : " + students[i].geteTest());
			System.out.println("평균 : " + students[i].getAvarage());
		}
	}

}
