package esercizio;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Order {
	Long id;
	String status;
	LocalDate orderDate, deliveryDate;
	List<Product> products;
	Customer customer;
	
	Random random = new Random();
	public Order (LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer) {
		this.id = random.nextLong();
		this.status = "spedito";
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.customer = customer;
	}
	
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "ordine di: " + this.customer.getName();	}
}
