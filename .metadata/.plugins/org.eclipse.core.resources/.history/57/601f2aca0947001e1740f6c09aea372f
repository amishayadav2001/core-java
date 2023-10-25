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
		
		Order order1= new Order(301
				, LocalDate.parse("2022-04-22",DateTimeFormatter.ofPattern("yyyy-MM-dd"))
				, Arrays.asList(l1,l4,l5));
		
		Order order2= new Order(302
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
			System.out.println("Order Total :"+x.getOrderPrice());
			System.out.println("*********************************");
		}
		
	}

}







//package com.aurionpro.test;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import com.aurionpro.model.Customer;
//import com.aurionpro.model.LineItem;
//import com.aurionpro.model.Order;
//import com.aurionpro.model.Product;
//
//public class CustomerTest {
//    public static void main(String[] args) {
//    	
//        Product product1 = new Product(11, "Dress", 50, 10);
//        Product product2 = new Product(22, "Utensils", 30, 5);
//
//        LineItem item1 = new LineItem(1, 3, product1);
//        LineItem item2 = new LineItem(2, 2, product2);
//
//        List<LineItem> items = new ArrayList<>();
//        items.add(item1);
//        items.add(item2);
//        Order order = new Order(1, new Date(), items);
//
//        List<Order> orders = new ArrayList<>();
//        orders.add(order);
//        Customer customer = new Customer(1, "Amisha", orders);
//      
//        double totalPrice = customer.getOrders().get(0).calculateOrderPrice();
//        System.out.println("Customer: " + customer);
//        System.out.println("Total Price: " + totalPrice);
//        
//        //System.out.println(Order.calculateOrderPrice())
//        
//    }
//}
//
