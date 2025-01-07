package com.tnsif.srccodes;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int res =0;
		System.out.println("enter two numbers");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		System.out.println("1.add");
		System.out.println("2.substract");
		System.out.println("3.multiply");
		System.out.println("4.divide");
		System.out.println("enter your choice");
		int ch = s.nextInt();
		switch (ch)
		{
		case 1: res = n1 + n2;break;
		case 2: res = n1 - n2;break;
		case 3: res = n1 * n2;break;
		case 4: res = n1 / n2;break;
		default:System.out.println("invalid choice");System.exit(1);//comes of program
		}
		System.out.println("Result="+res);
	}
}
