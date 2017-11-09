package com.sivasankar.patterns.creational.factorymethod;

public class Demo {
	public static void main(String[] args) {
		Factory factory = Factory.getInstance(args[0]);
		Product p = factory.makeProduct();
		System.out.println(p.showDesc());
	}
}
