package com.kh.silsub2.person.controller;

import java.util.Scanner;

import com.kh.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = new Person[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < persons.length; i++) {
			System.out.print("�̸��� �Է� �ϼ��� : ");
			String name = sc.next();	
			System.out.print("���̸� �Է� �ϼ��� : ");
			int age = sc.nextInt();
			System.out.print("������ �Է� �ϼ��� : ");
			char gender = sc.next().charAt(0);
			System.out.print("Ű�� �Է� �ϼ��� : ");
			double height = sc.nextDouble();
			System.out.print("ü���� �Է� �ϼ��� : ");
			double weight = sc.nextDouble();
			
			persons[i] = new Person(name, age, gender, height, weight);
		}
		
		for(int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].personInfo());
		}
		
		int sumAge = 0;
		double sumHeight = 0;
		double sumWeight = 0;
		
		for(int i = 0; i < persons.length; i++) {
			sumAge += persons[i].getAge();
			sumHeight = persons[i].getHeight();
			sumWeight = persons[i].getWeight();
		}
		
		System.out.println("��� ���� : " + sumAge / 5);
		System.out.println("��� Ű : " + sumHeight / 5.0);
		System.out.println("��� ü�� : " + sumWeight / 5.0);
	}

}
