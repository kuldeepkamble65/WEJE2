package com.jspider.multithreading.Thread;


public class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
			
		}
		
	}
	
}
	


