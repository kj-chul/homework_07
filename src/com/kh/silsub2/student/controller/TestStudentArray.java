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
			
			System.out.print("�г��� �Է� �ϼ��� : ");
			int grade = sc.nextInt();
			System.out.print("���� �Է� �ϼ��� : ");
			int classroom = sc.nextInt();
			System.out.print("�̸��� �Է� �ϼ��� : ");
			String name = sc.next();
			System.out.print("���� ������ �Է� �ϼ��� : ");
			int kScore = sc.nextInt();
			System.out.print("���� ������ �Է� �ϼ��� : ");
			int eScore = sc.nextInt();
			System.out.print("���� ������ �Է� �ϼ��� : ");
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
			
			System.out.print("��� �Է� �Ͻðڽ��ϱ�?(y/n) : ");
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
			
			System.out.println("�г� : " + students[i].getGrade());
			System.out.println("�� : " + students[i].getClassroom());
			System.out.println("�̸� : " + students[i].getName());
			System.out.println("�������� : " + students[i].getkTest());
			System.out.println("�������� : " + students[i].getmTest());
			System.out.println("�������� : " + students[i].geteTest());
			System.out.println("��� : " + students[i].getAvarage());
		}
	}

}
