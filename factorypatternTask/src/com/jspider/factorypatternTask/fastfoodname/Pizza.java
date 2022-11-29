package com.jspider.factorypatternTask.fastfoodname;

import com.jspider.factorypatternTask.interf.FastFood;

public class Pizza implements FastFood{

	@Override
	public void orderFood() {
		System.out.println("Order Pizza");
	}

}
