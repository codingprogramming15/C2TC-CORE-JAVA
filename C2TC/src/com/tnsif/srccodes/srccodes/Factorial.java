package com.tnsif.srccodes;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int f = 1;
		for (int i =n;i>=1;i--)
			f = f * i;
		System.out.println("Factorial = "+f);

	}

}

/*
 * enter a number 5(n = 5,f=1) 
 * f=f*i=1*5=5 
 * f=f*i=5*4=20 
 * f=f*i=20*3=60
 * f=f*i=60*2=120 
 * f=f*i=102*1=120
 */