package com.tnsif.srccodes;
import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter roll number");
        int rollNum = s.nextInt();
        System.out.println("enter the name");
        String name = s.next();
        System.out.println("enter the marks in three subjects");
        double mark1 = s.nextDouble();
        double mark2 = s.nextDouble();
        double mark3 = s.nextDouble();
        double total = mark1 + mark2 + mark3;
        double avg = total / 3;
        System.out.println("roll number = "+rollNum);
        System.out.println("name ="+name);
        System.out.println("total marks=" +total);
        System.out.println("avarage=" +avg);
	}

}
