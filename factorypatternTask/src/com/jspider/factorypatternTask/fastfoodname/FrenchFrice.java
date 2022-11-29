package com.jspider.factorypatternTask.fastfoodname;

import com.jspider.factorypatternTask.interf.FastFood;

public class FrenchFrice implements FastFood{

	@Override
	public void orderFood() {
		System.out.println("Order FrenchFrice");		
	}

}
