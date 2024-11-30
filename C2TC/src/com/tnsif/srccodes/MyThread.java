package com.tnsif.srccodes;




public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

		class Mythread extends Thread{
			public void run() {
				for(int i=1;i<= 5;i++) {
					System.out.println("Thread"+Thread.currentThread().getId()+" -count:"+i);
					
				}
			}
		}

		public void start() {
			// TODO Auto-generated method stub
			
		}
	}


