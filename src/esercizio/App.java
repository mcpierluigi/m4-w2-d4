package esercizio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);

		//Customers
		Customer pier = new Customer("Pierluigi",1);
		Customer nico = new Customer("Nicolò",1);
		Customer anna = new Customer("Annamaria",2);
		Customer samu = new Customer("Samuele",2);
		Customer luna = new Customer("Luna", 3);
		
		//Products
		Product book1 = new Product("book1", "Books", 20.00);
		Product book2 = new Product("book2", "Books", 5.00);
		Product book3 = new Product("book3", "Books", 25.00);
		Product book4 = new Product("book4", "Books", 8.00);
		Product book5 = new Product("book4", "Books", 45.00);
		
		Product baby1 = new Product("baby1", "Baby", 3.00);
		Product baby2 = new Product("baby2", "Baby", 10.50);
		Product baby3 = new Product("baby3", "Baby", 5.99);
		Product baby4 = new Product("baby4", "Baby", 7.20);
		Product baby5 = new Product("baby5", "Baby", 5.30);
		
		Product boy1 = new Product("boy1", "Boys", 2.00);
		Product boy2 = new Product("boy2", "Boys", 3.00);
		Product boy3 = new Product("boy3", "Boys", 4.00);
		Product boy4 = new Product("boy4", "Boys", 5.00);
		Product boy5 = new Product("boy5", "Boys", 6.00);
		
		//List products
		
		//List without baby
		List<Product> products1 = new ArrayList<>();
		products1.add(book1); 
		products1.add(book2); 
		products1.add(book3);
		products1.add(boy1);
		products1.add(boy4);
		
		//List without boy
		List<Product> products2 = new ArrayList<>();
		products2.add(baby1);
		products2.add(baby2);
		products2.add(baby5);
		products2.add(book4);
		products2.add(book5);
		
		//List without book
		List<Product> products3 = new ArrayList<>();
		products3.add(boy2);
		products3.add(boy3);
		products3.add(boy5);
		products3.add(baby3);
		products3.add(baby4);
		
		//Orders 
		Order order1 = new Order(today, tomorrow, products1, pier);
		Order order2 = new Order(today, tomorrow, products2, nico);
		Order order3 = new Order(today, tomorrow, products3, anna);
		Order order4 = new Order(today, tomorrow, products1, samu);
		Order order5 = new Order(today, tomorrow, products2, luna);
		
		//List of Orders
		List<Order> orders = new ArrayList<>();
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		orders.add(order5);
		
		//Functions
		
		//ESERCIZIO 1
		List<Product> expensiveBooks1 = products1.stream().
				filter(category -> category.getCategory() == "Books").
				filter(price -> price.getPrice() > 10).toList();
		System.out.println(expensiveBooks1);
		
		List<Product> expensiveBooks2 = products2.stream().
				filter(category -> category.getCategory() == "Books").
				filter(price -> price.getPrice() > 10).toList();
		System.out.println(expensiveBooks2);
		
		//ESERCIZIO 2
		List<Order> ordersWithBabyProducts = orders.stream().filter(order -> order.getProducts()
				.stream().anyMatch(product -> product.getCategory() == "Baby")).toList();
		System.out.println(ordersWithBabyProducts);	
		
		//ESERCIZIO 3
		List<Product> orderForBoys1 = products1.stream().
				filter(category -> category.getCategory() == "Boys")
				.map(product -> {
					product.setPrice(product.getPrice() * 0.9);
					return product;
				}).toList();
		System.out.println(orderForBoys1);
		
		List<Product> orderForBoys2 = products3.stream().
				filter(category -> category.getCategory() == "Boys")
				.map(product -> {
					product.setPrice(product.getPrice() * 0.9);
					return product;
				}).toList();
		System.out.println(orderForBoys2);
	}
}