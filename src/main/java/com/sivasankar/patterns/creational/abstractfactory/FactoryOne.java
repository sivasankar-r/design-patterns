package com.sivasankar.patterns.creational.abstractfactory;

public class FactoryOne extends Factory {

	@Override
	Category createCategory() {
		return new CategoryOne();
	}

	@Override
	Product createProduct() {
		return new ProductOne();
	}

	@Override
	Item createItem() {
		return new ItemOne();
	}

}
