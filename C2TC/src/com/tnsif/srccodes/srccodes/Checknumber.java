package com.tnsif.srccodes;
import java.util.Scanner;
public class Checknumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		if (n>0)
			System.out.println("positive");
		else
			if (n>0)
				System.out.println("negative");
			else
				System.out.println("zero");

	}

}
