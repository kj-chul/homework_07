package com.kh.silsub2.person.controller;

import java.util.Scanner;

import com.kh.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = new Person[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < persons.length; i++) {
			System.out.print("이름을 입력 하세요 : ");
			String name = sc.next();	
			System.out.print("나이를 입력 하세요 : ");
			int age = sc.nextInt();
			System.out.print("성별을 입력 하세요 : ");
			char gender = sc.next().charAt(0);
			System.out.print("키를 입력 하세요 : ");
			double height = sc.nextDouble();
			System.out.print("체중을 입력 하세요 : ");
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
		
		System.out.println("평균 나이 : " + sumAge / 5);
		System.out.println("평균 키 : " + sumHeight / 5.0);
		System.out.println("평균 체중 : " + sumWeight / 5.0);
	}

}
