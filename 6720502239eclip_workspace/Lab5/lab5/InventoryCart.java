package lab5;

public class InventoryCart {
	private Product cart[];
	private int i = 0;
	
	public InventoryCart(int capa) {
		this.cart = new Product[capa];
	}
	public void add(Product addproduct) {
		cart[i] = addproduct;
		i++;
	}
	public Product getProduct(int index) {
		return cart[index];
	}
	public Product[] getAllProduct() {
		Product item[] = new Product[i];
		for (int j = 0 ; j < item.length ; j++) {
			item[j] = cart[j];
		}
		return item;
	}
}
