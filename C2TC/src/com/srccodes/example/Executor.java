package com.srccodes.example;

public class Executor {

	public static void main(String[] args) {
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		
	//b1.varPrivate;	
		b1.varDefault=11;
		b1.methodDefault();
		

	}

}
