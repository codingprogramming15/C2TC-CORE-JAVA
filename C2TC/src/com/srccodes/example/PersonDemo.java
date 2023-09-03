package com.srccodes.example;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		person p1 =new person();
		System.out.println("Enter person details");
		Scanner sc=new Scanner(System.in);
		     String name=sc.nextLine();
		     int age=sc.nextInt();
		     String city=sc.next();
		
		//p1.setPersonName(name);
		//p1.setPersonAge(age);
		//p1.setPersonCity(city);
		
		
		
		System.out.println(p1.getPersonName());
		System.out.println(p1.getPersonAge());
		System.out.println(p1.getPersonCity());
		
		
		
		p1=new Person(name,age,city);
		  System.out.println(p1.getPersonName());
		  System.out.println(p1.getPersonAge());
		  System.out.println(p1.getPersonCity());
		  System.out.println("Parameterized constructor executed");
		  sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
