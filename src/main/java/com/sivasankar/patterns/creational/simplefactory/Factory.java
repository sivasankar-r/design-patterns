package com.sivasankar.patterns.creational.simplefactory;

public class Factory {

	public static Product create(String type) {
		Product product = null;
		if(type.equalsIgnoreCase("one")) {
			product = new ProductOne();
		} else if(type.equalsIgnoreCase("two")) {
			product = new ProductTwo();
		} else if(type.equalsIgnoreCase("three")) {
			product = new ProductThree();
		} else {
			throw new IllegalArgumentException("No such product exist. Product type : " + type);
		}
		return product;
	}

}
