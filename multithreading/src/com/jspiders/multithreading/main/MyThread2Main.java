package com.jspiders.multithreading.main;
import com.jspider.multithreading.Thread.MyThread1;
import com.jspider.multithreading.Thread.MyThread2;

public class MyThread2Main {
	public static void main(String[] args) {
		 MyThread2 myThread2=new MyThread2();
		 Thread thread = new Thread(myThread2);
		 thread.setName("MyThread_1");
		 thread.start();
		 
		 MyThread1 myThread1=new MyThread1();
		 myThread1.setName("MyThread_2");
		 myThread1.start();
		 
		 
		 
	}

}
