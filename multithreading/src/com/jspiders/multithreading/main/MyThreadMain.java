package com.jspiders.multithreading.main;

import com.jspider.multithreading.Thread.MyThread1;

public class MyThreadMain {
	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();
		myThread.start();
	}

}
