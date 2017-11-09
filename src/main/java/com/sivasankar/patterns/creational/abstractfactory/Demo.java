package com.sivasankar.patterns.creational.abstractfactory;

public class Demo {

	public static void main(String[] args) {
		Factory factory = Factory.getInstance(args[0]);
		Category category = factory.createCategory();
		Item item = factory.createItem();
		Product product = factory.createProduct();

		System.out.println(category.getDesc()); 
		System.out.println(item.getDesc());
		System.out.println(product.getDesc());

	}

}
