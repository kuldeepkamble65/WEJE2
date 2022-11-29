package com.jspider.multithreadingtask2.thread;

import com.jspider.multithreadingtask2.resource.Godown;

public class Supplier extends Thread {
	Godown godown;

	public Supplier(Godown godown) {
		super();
		this.godown = godown;
	}
	public void run() {
		godown.orderSupply(50);
	}

}
