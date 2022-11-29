package com.jspider.multithreadingtask2.resource;
public class Godown {
	int storeProduct;

	public Godown(int product) {
		System.out.println(product+ " products are available");
		this.storeProduct = product;
	}
	public int checkProduct() {
		return storeProduct;
	
	}
	public synchronized void orderProduc(int product) {
		System.out.println("\n Customer Ordering "+product+" product");
		if(this.storeProduct >= product) {
			System.out.println(product+ " Products Suppled");
		this.storeProduct -= product;
		System.out.println(checkProduct()+ " Products available");
		}
	
	else
	{
		try {
			System.out.println(product+ " Product not available please wait");
			this.wait();
			System.out.println(checkProduct()+ " Products available");
			System.out.println(product +" Product suppled Successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}
	public synchronized void orderSupply(int product) {
		System.out.println("Supplying " +product+ " Product in Godown");
		this.storeProduct += product;
		System.out.println(storeProduct+ "Product available in godown");
		this.notify();
	}

}
