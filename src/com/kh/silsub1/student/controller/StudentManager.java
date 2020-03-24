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
	
	//3�г� 1�� 1�� ȫ�浿
	//4�г� 3�� 2�� ������
	//2�г� 7�� 5�� ������

	
	public void insertStudentData() {
		for(int i = 0; i < students.length; i++) {			
			System.out.print("�г��� �Է� �ϼ��� : ");
			students[i].setGrade(sc.nextInt());
			System.out.print("���� �Է� �ϼ��� : ");
			students[i].setClassroom(sc.nextInt());
			System.out.print("��ȣ�� �Է� �ϼ��� : ");
			students[i].setStdNo(sc.nextInt());
			System.out.print("�̸��� �Է� �ϼ��� : ");	
			students[i].setName(sc.next());
		}
	}
	
	public void printStudentData() {
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].information());
		}
	}
}
