package com.sivasankar.patterns.creational.factorymethod;

public abstract class Factory {
	abstract Product makeProduct();
	
	public static Factory getInstance(String type) {
		Factory factory = null;
		if(type.equalsIgnoreCase("one")) {
			factory = new FactoryOne();
		} else if(type.equalsIgnoreCase("two")) {
			factory = new FactoryTwo();
		}
		return factory;
	}
}
