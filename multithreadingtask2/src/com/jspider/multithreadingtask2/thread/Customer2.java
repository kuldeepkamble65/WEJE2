package com.jspider.multithreadingtask2.thread;

import com.jspider.multithreadingtask2.resource.Godown;

public class Customer2 extends Thread {
	Godown godown;

	public Customer2(Godown godown) {
		super();
		this.godown = godown;
	}
	public void run() {
		godown.orderProduc(70);
	}
}
