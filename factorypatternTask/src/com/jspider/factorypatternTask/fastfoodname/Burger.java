package com.jspider.factorypatternTask.fastfoodname;

import com.jspider.factorypatternTask.interf.FastFood;

public class Burger implements FastFood{

	@Override
	public void orderFood() {
		System.out.println("Order Burger");
	}

}
