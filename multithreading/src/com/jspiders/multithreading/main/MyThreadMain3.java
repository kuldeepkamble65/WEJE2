package com.jspiders.multithreading.main;

import com.jspider.multithreading.Thread.MyThread1;
import com.jspider.multithreading.Thread.MyThread2;

public class MyThreadMain3 {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.setName("Thread1");
		System.out.println(myThread1.getName());
		myThread1.setPriority(6);
		
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		
		thread.setName("Thread2");
		System.out.println(thread.getName());
		
		thread.setPriority(8);
		
		thread.start();
		myThread1.start();
	}

}
