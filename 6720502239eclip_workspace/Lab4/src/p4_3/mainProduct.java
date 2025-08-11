package p4_3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Product[] products = new Product[5];
    Scanner sc = new Scanner(System.in);
    products[0] = new Product(0,"Mama",5.5);
    products[1] = new Product(10,"Lays",10.5);

    System.out.println("======== Enter Products detail ========");
    for (int i = 2 ; i <= 4 ; i++ ) {
      System.out.println("Product code " + i*10);
      System.out.print("name : ");
      String name = sc.nextLine();
      System.out.print("price : ");
      double price = Double.parseDouble (sc.nextLine());
      products[i] = new Product(i*10, name, price);
    }
    System.out.println("\n\n======== List of Products ========");
    for (int j = 0 ; j <= 4 ; j++ ) {
      System.out.println("Product code " + products[j].getCode());
      System.out.println("name:" + products[j].getName()+" , Price: "+products[j].getPrice());
    }
    System.out.println("\n======== What do you want to buy? ========");
    System.out.println("Enter product code (press -1 to exit)");
    int total = 0;
    while (true)
      {
        System.out.print("Product code: ");
        int code = sc.nextInt();
        if (code == -1)
          break;
        System.out.print("Amount of "+products[code/10].getName()+": ");
        int amount = sc.nextInt();
        total += products[code/10].getPrice()*amount;
      }
    System.out.println("You have to pay "+total+" Baht");
  }

}
