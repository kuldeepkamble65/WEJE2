package com.jspider.factorypatternTask.fastfoodname;

import com.jspider.factorypatternTask.interf.FastFood;

public class ColdCofee implements FastFood{

	@Override
	public void orderFood() {
		System.out.println("Order ColdCofee");
	}

}
