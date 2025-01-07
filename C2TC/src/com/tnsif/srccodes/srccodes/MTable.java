package com.tnsif.srccodes;
import java.util.Scanner;
public class MTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n =s.nextInt();
		for(int i=1;i<=10;i++)
		{
			int p = n*i;
			System.out.println(n+" * "+i+" ="+p);
		}
	}

}

/*
 * enter a number 5 (n=5) 
 * 5*1=5 
 * 5*2=10 
 * ... 
 * 5*10=50
 */