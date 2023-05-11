package esercizio;

import java.util.Random;

public class Product {
	private Long id;
	String name;
	String category;
	Double price;
	
	public String getCategory() {
		return category;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Double setPrice(Double p) {
		return this.price = p;
	}
	
	Random random = new Random();
	public Product (String name, String category, Double price) {
		this.id = random.nextLong();
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + " name: " + this.name +
		" category: " + this.category + " price: " + this.price + "$";
	}
	
	
}
