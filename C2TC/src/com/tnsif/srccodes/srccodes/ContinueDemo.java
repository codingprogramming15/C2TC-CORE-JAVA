package com.tnsif.srccodes;
import java.util.Scanner;
public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = 1;
		while (i<10)
		{
			if (i == 5)
			{
				i++;
				continue;
			}
			System.out.println(i+" ");
			i++;
		}

	}

}
