package entities;

public class Product implements Comparable<Product> {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getName() + ", Price: U$" + String.format("%.2f",getPrice());
	}

	@Override
	public int compareTo(Product p) {
		return name.toUpperCase().compareTo(p.getName().toUpperCase());
	}
}
