package com.srccodes.example;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=520,originalnumber,remainder,result=0;
		originalnumber=number;
		while(originalnumber!=0)
		{
			remainder=originalnumber%10;
			result+=Math.pow(remainder,3); 
			originalnumber/=10;
		}
		if(result==number)
			System.out.println(number +"is an amstrong number.");
		else
			System.out.println(number +" is not amstrong");
		
		}

	}


