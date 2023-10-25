package com.aurionpro.model;

public class LineItem {

	private int id;
	private int quantity;
	private Product product;
	private double lineItemPrice;

	public LineItem(int id, int quantity, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.product = product;
		this.lineItemPrice = calculateLineItemPrice();
	}

	public double getLineItemPrice() {
		return lineItemPrice;
	}

	public void setLineItemPrice(double lineItemPrice) {
		this.lineItemPrice = lineItemPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	private double calculateLineItemPrice() {
		return product.calculateDiscountedPrice() * quantity;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", quantity=" + quantity + ", lineItemPrice=" + lineItemPrice + "]";
	}

}
