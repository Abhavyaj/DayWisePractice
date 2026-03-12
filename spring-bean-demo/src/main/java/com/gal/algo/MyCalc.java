package com.gal.algo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MyCalc implements Calc {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@PostConstruct
	public void onInit() {
		System.out.println("Initialization method for DBConnect, Websockets open, n/w connetion open");
	}
	//act as Destruction 
	@PreDestroy
	public void onDestroy() {
		System.out.println("on destroy of object : close resouces");
	}
}

