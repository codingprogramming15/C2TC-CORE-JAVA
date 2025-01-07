package com.tnsif.srccodes;

public class MethodoverloadingExample {
	
	public int add (int a,int b) {
		return a+b ;
	}
	public int add (int a,int b, int c) {
		return a+b+c;
	}
	public double add (double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		MethodoverloadingExample example = new MethodoverloadingExample();
		System.out.println(" sum of two integers:" +example.add(5,10));
		System.out.println(" sum of three integers:" + example.add(5, 10,15));
		System.out.println("sum of two doubles:"+ example.add(2.5,3.7));
	}
		
		

	}


