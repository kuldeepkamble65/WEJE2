package com.jspider.multithreadingtask2.thread;

import com.jspider.multithreadingtask2.resource.Godown;

public class Customer1 extends Thread {
	Godown godown;

	public Customer1(Godown godown) {
		super();
		this.godown = godown;
	}
	public void run() {
		godown.orderProduc(50);
	}
	
}
