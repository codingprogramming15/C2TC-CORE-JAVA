package com.tnsif.srccodes;
import java.util.Scanner;
public class ArrayCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter array size");
		int size = s.nextInt();
		int[] n = new int[size];
		System.out.println("enter "+size+" values");
		for (int i=0;i<n.length;i++)
			n[i]= s.nextInt();
		System.out.println("given array element");
		for(int i=0;i<n.length;i++)
			System.out.println(n[i]);
	}

}
