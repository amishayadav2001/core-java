package com.aurionpro.model;


public class ProductRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Product created");

	}

	@Override
	public void read() {
		System.out.println("Reading products");

	}

	@Override
	public void update() {
		System.out.println("Updating products");

	}

	@Override
	public void delete() {
		System.out.println("Deleting products");

	}
	
	public int printCategoriescount() {
		return categories;
	}

}
