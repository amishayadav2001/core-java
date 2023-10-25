package com.aurionpro.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class CustomerTest {

	public static void main(String[] args) {
		Product p1=new Product(101, "Pepsi", 120, 15);
		Product p2=new Product(102, "Kurkure", 35, 6);
		Product p3=new Product(103, "Lays", 60, 8);
		Product p4=new Product(104, "Sprite", 85, 15);
		Product p5=new Product(105, "Parle-G", 10, 8);
		Product p6=new Product(106, "Haldiram Aloo Bhujiya", 75, 10);
		Product p7=new Product(107, "Amul Lassi", 25, 2);
		Product p8=new Product(108, "Britania Wheat bread", 45, 5);
		
		
		LineItem l1 = new LineItem(201, 5, p3);
		LineItem l2 = new LineItem(202, 10, p1);
		LineItem l3 = new LineItem(203, 15, p2);
		LineItem l4 = new LineItem(204, 5, p4);
		LineItem l5 = new LineItem(205, 20, p6);
		
		Order order1= new Order(110
				, LocalDate.parse("2022-04-22",DateTimeFormatter.ofPattern("yyyy-MM-dd"))
				, Arrays.asList(l1,l4,l5));
		
		Order order2= new Order(111
				, LocalDate.parse("2022-03-18",DateTimeFormatter.ofPattern("yyyy-MM-dd"))
				, Arrays.asList(l1,l2,l3));
		
		Customer customer = new Customer(401, "Amisha", Arrays.asList(order1,order2));
		
		System.out.println("ID :"+customer.getId()+"\nName :"+customer.getName());
		
		for(Order x:customer.getOrderList()) {
			System.out.println(x);
			System.out.println("-------------------");
			for(LineItem l:x.getItemList()) {
				System.out.print(l);
				System.out.println(l.getProduct());
			}
			System.out.println("Total Order Price :"+x.getOrderPrice());
			System.out.println("*******************************************************");
		}
		
	}

}







