package com.sivasankar.patterns.creational.factorymethod;

public class FactoryTwo extends Factory {

	public Product makeProduct() {
		return new ProductTwo();
	}

}
