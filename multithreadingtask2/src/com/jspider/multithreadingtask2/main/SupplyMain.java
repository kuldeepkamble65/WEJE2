package com.jspider.multithreadingtask2.main;

import com.jspider.multithreadingtask2.resource.Godown;
import com.jspider.multithreadingtask2.thread.Customer1;
import com.jspider.multithreadingtask2.thread.Customer2;
import com.jspider.multithreadingtask2.thread.Supplier;

public class SupplyMain {
	public static void main(String[] args) {
		Godown godown = new Godown(100);
		Customer1 customer1 = new Customer1(godown);
		Customer2 customer2 = new Customer2(godown);
		Supplier supplier = new Supplier(godown);
		
		customer1.start();
		customer2.start();
		supplier.start();
	}
}
