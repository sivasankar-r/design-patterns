package com.sivasankar.patterns.creational.abstractfactory;

public class FactoryTwo extends Factory {

	@Override
	Category createCategory() {
		return new CategoryTwo();
	}

	@Override
	Item createItem() {
		return new ItemTwo();
	}

	@Override
	Product createProduct() {
		return new ProductTwo();
	}

}
