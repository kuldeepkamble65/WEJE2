package com.jspider.singletone.eager;

public class SingletoneEager {
	static int objectcount;
	
	static SingletoneEager singletoneEager = new SingletoneEager();
	
	private SingletoneEager() {
		objectcount++;
		
	}
	public static SingletoneEager getobject() {
	    System.out.println("Object Created "+objectcount+" times");
	return singletoneEager;
	}
}
