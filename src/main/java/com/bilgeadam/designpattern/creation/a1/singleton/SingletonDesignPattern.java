package com.bilgeadam.designpattern.creation.a1.singleton;

public class SingletonDesignPattern {
	// sdp: static,classAdý
	
	// 1.adým intance Class nesnesi
	private static SingletonDesignPattern instance = null; // default null geliyor.
	
	// 2.adým
	private SingletonDesignPattern() {
	}
	
	// 3.adým
	public static SingletonDesignPattern getInstance() {
		// eðer nesnemiz oluþmamýþsa yeni oluþtur
		if (instance == null) {
			instance = new SingletonDesignPattern();
		}
		return instance;// eðer nesnemiz varsa var olaný kullan
	}
	
}
