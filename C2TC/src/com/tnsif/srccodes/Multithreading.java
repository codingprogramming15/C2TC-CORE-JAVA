package com.tnsif.srccodes;
class Mythread extends Thread{
	public void run() {
		for(int i=1;i<= 5;i++) {
			System.out.println("Thread"+Thread.currentThread().getId()+" -count:"+i);
			
		}
	}
}
public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		thread1.start();
		thread2.start();
		
		

	}

}
