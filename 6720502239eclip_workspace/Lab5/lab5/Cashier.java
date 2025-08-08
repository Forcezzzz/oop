package lab5;

public class Cashier {
	private String user;
	
	public Cashier(String username) {
		this.user = username;
	}
	public void printReceipt(InventoryCart cart) {
		System.out.println("\tPumpkin Shop ("+ user + ")\n");
		Product[] products = cart.getAllProduct();
		int total = 0;
		for (int i = 0 ; i < products.length ; i++) {
			System.out.println(" 1 x " + products[i].getName() +"\t"+ "(" + products[i].getCode() + ")\t" + products[i].getPrice());
			total += products[i].getPrice();
		}
		System.out.println("------------");
		System.out.println("Total\t" + total +"$");
	}
}
