package com.bilgeadam.designpattern.creation.a1.singleton;

public class SingletonDesignPattern {
	// sdp: static,classAd�
	
	// 1.ad�m intance Class nesnesi
	private static SingletonDesignPattern instance = null; // default null geliyor.
	
	// 2.ad�m
	private SingletonDesignPattern() {
	}
	
	// 3.ad�m
	public static SingletonDesignPattern getInstance() {
		// e�er nesnemiz olu�mam��sa yeni olu�tur
		if (instance == null) {
			instance = new SingletonDesignPattern();
		}
		return instance;// e�er nesnemiz varsa var olan� kullan
	}
	
}
