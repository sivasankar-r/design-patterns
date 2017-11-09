package com.sivasankar.patterns.creational.abstractfactory;

public abstract class Factory {
	abstract Category createCategory();
	abstract Item createItem();
	abstract Product createProduct();
	
	public static Factory getInstance(String type) {
		Factory factory = null;
		if(type.equalsIgnoreCase("one")) {
			factory = new FactoryOne();
			return factory;
		} else if(type.equalsIgnoreCase("two")) {
			factory = new FactoryTwo();
		}
		return factory;
	}
}
