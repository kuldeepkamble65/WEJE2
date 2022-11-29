package com.jspider.singletone.object;

public class SingletoneLazy {
	static SingletoneLazy singletoneLazy;
	int objectcount;
	
	private SingletoneLazy() {
		objectcount++;
		System.out.println("Object Created "+objectcount+" Times");
	}
	
	public static SingletoneLazy getobject() {
		if(singletoneLazy == null) {
			singletoneLazy = new SingletoneLazy();
			return singletoneLazy;
		}
		return singletoneLazy;
	}

}
