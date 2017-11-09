package com.sivasankar.patterns.creational.factorymethod;

public class FactoryOne extends Factory {

	public Product makeProduct() {
		return new ProductOne();
	}
}

