package esercizio;

import java.util.Random;

public class Customer {
	Long id;
	String name;
	Integer tier;
	
	Random random = new Random();
	public Customer (String name, Integer tier) {
		this.id = random.nextLong();
		this.name = name;
		this.tier = tier; 
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "id: " + this.id + " name: " + this.name + " tier: " + this.tier;
	}
}
