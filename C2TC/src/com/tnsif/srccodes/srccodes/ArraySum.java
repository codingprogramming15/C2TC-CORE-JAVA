package com.tnsif.srccodes;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] n = new int[5];
		int sum= 0;
		System.out.println("enter 5 values");
		for(int i =0;i<n.length;i++)
		{
			
			n[i] = s.nextInt();
		    sum = sum +n[i];
		
		}
		System.out.println("sum = "+sum);
	}

}
