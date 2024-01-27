package application;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("<<Enter product data>>");
		
		System.out.printf("Name: ");
		product.name = sc.nextLine();
		System.out.printf("Price: ");
		product.price = sc.nextDouble();
		System.out.printf("Quantity in stock: ");
		product.quantity = sc.nextInt();
		System.out.printf("%nProduct data -----> " + product);
		
		System.out.printf("%n%nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		System.out.printf("%nUpdated data -----> " + product);

		System.out.printf("%n%nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.printf("%nUpdated data -----> " + product);
		
		System.out.printf("%n%nFINISHING...");
		
		sc.close();
		
		
		
		
	}

}
