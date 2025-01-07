package com.tnsif.srccodes;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stue
		Scanner s = new Scanner(System.in);
		int bal,amt,ch;
		System.out.println("Enter current balance");
		bal = s.nextInt();
		do
		{
			System.out.println("1.Deposit");
			System.out.println("2.withdraw");
			System.out.println("3.display balanc3");
			System.out.println("4.exit");
			System.out.println("enter your choice");
			ch = s.nextInt();
			switch (ch)
			{
			case 1: System.out.println("enter amount to deposit");
			        amt =s.nextInt();
			        bal = bal + amt;break;
			case 2: System.out.println("enter amount to withdraw");
			        amt = s.nextInt();
			        if (amt > bal)
			        	System.out.println("insufficient balance");
			        else
			        	bal = bal-amt;
			case 3: System.out.println("current balance=" +bal);break;
			case 4: System.out.println("thank u for banking");
			default:System.out.println("invalid choice");
			}
			
		}while (ch !=4);

	}

}
