package lab5;

public class Product {
	private String code;
	private String name;
	private int price;
	
	public Product (String code,String name,int price)
	{
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public String getCode() {
		return this.code;
	}
	public String getName()	{
		return this.name;
	}
	public int getPrice()	{
		return this.price;
	}
	
}
