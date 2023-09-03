package com.srccodes.example;

public class AcessesDemo {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.z);
		
	}
	
}
	
	
	class Demo
	{
		public int x=50;
		protected int y=60;
		int z=70;
		private int p=80;
		
		public void display()
		{
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(p);
		
			
		}
		// TODO Auto-generated method stub

	}


