package com.tnsif.srccodes;
import java.util.Scanner;
public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n,sum =0;
		while(true) //infinite loop
		{
			
		   System.out.println("enter a number to stop enter zero");
		   n = s.nextInt();
		   if (n==0)
			   break;
		   sum = sum +n;
		   
		}
		System.out.println("sum = " +sum);

	}

}
