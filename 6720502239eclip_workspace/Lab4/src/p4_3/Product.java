package p4_3;

public class Product {
	private int code;
	private String name;
	private double price;
	
	public Product(int code,String name,double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public int getCode() {
		return this.code;
	}
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
}