package p4_3;

import java.util.Scanner;

public class mainProduct {

	public static void main(String[] args) {
		Product[] products = new Product[5];
		Scanner sc = new Scanner(System.in);
		products[0] = new Product(0,"Mama",5.5);
		products[1] = new Product(10,"Lays",10.5);

		System.out.println("======== Enter Products detail ========");
		for (int i = 2 ; i <= 4 ; i++ ) {
			System.out.println("Product code " + i*10);
			System.out.println("name : ");
			String name = sc.nextLine();
			System.out.println("price : ");
			Double price = sc.nextDouble();
			products[i] = new Product(i*10, name, price);
		}
		System.out.println("\n\n======== List of Products ========");
		for (int j = 0 ; j <= 4 ; j++ ) {
			System.out.println("Product code");
		}
	}

}
