package com.aurionpro.model;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
	private int id;
	private LocalDate orderDate;
	private List<LineItem> itemList;
	private double orderPrice;

	public Order(int id, LocalDate orderDate, List<LineItem> itemList) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.itemList = itemList;
		this.orderPrice = calculateOrderPrice();
	}

	private double calculateOrderPrice() {
		return itemList.stream().collect(Collectors.summingDouble(LineItem::getLineItemPrice));

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public List<LineItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<LineItem> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + "]";
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

}
