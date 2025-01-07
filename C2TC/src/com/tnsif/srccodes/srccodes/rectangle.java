// this is the userfriendly program because we can analyze the how to write length and breadth values

package com.tnsif.srccodes;
import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length value");
		int length = s.nextInt();
		System.out.println("enter the breadth value");
		int breadth = s.nextInt();
		int area = length * breadth;
		System.out.println("Area of rectangle="+area);
		

	}

}
