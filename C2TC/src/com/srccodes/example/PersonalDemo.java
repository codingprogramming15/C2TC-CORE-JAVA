package com.srccodes.example;

import java.util.Scanner;

public class PersonalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the name of the person");
		String name=ob.next();
		System.out.println("Enter the age of the person");
		int age=ob.nextInt();
		System.out.println("Enter the gender");
		String gender=ob.next();
		System.out.println("Enter the income");
		int income=ob.nextInt();
		
		person person=new person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person);
		
		
		
		System.out.println("After Tax calculation");
		System.out.println(person);
		
		
		
		
	}

}
