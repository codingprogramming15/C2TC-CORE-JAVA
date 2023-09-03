package com.srccodes.example;

public class SwitchDemo {

	public static void main(String[] args) {
		char x = 'z';
		switch (x)
		{
		case 'l':
		case 'L':
		   System.out.println(x+" is a letter");
		   break;
		case 'd':
		case 'D':
		  System.out.println(x+" is a Digit");
		   break;
		case 'w':
		case 'W':
			System.out.println(x+" is a white space");
		case 's':
		case 'S':
			System.out.println(x+" is aspecial symbol");
			default:
				System.out.println(x+" is other than letter,digit,space or secial symbol");
				break;
			
		   
		}
		// TODO Auto-generated method stub

	}

}
