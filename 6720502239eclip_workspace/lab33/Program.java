import java.util.Scanner;

public class Program {

	public static void main(String[] args)
	{
		Book book1= new Book();
			//book1.name = "Harry Potter and The Chamber of Secret";
			book1.year = 2542;
			book1.author = "J.K. Rowling";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Book name: ");
				book1.name = sc.nextLine();
			System.out.println("Enter Book price : ");
				book1.price = sc.nextInt();	
			System.out.println("Book: "+book1.name);
			System.out.println("Written by "+book1.author+" in "+book1.year);
			System.out.println("Price is "+book1.price+" Baht");
	}
}
