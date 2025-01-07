package com.tnsif.srccodes;
import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] n = new int[5];
		System.out.println("enter 5 values");
		for(int i =0;i<n.length;i++)
			n[i] = s.nextInt();
		System.out.println("enter value to search");
		int key = s.nextInt();
			
		if (search(n,key))
			System.out.println("Found");
		else
			System.out.println("not found");

	}
	static boolean search(int[] n,int key)
	{
	boolean isFound = false;
	for(int i=0;i<n.length;i++)
	{
		if (key == n[i])
		{
			isFound = true;
			break;
		}

}
	return isFound;
}
}