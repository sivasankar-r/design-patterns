package com.sivasankar.patterns.creational.simplefactory;

public class Demo {

	public static void main(String[] args) {
		Product product = Factory.create(args[0]);
		System.out.println(product.getDesc());
	}

}
