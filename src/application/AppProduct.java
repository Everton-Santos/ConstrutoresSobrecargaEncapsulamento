package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product;

public class AppProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			/*System.out.print("Quantity in stock: ");
			int quantity = sc.nextInt();
			
			
			Product product = new Product(name, price, quantity);
			*/
			Product product = new Product(name, price);
			
			Product p = new Product();
			
			System.out.println("\nProduct " + product);
			
			
			System.out.print("\nEnter the number of products to be added in stock: ");
			product.addProducts(sc.nextInt());
			
			System.out.println("\nUpdated " + product);
			
			System.out.print("\nEnter the number of products to be removed from stock: ");
			product.removeProducts(sc.nextInt());
			
			System.out.println("\nUpdate " + product);
			
			System.out.println("\n*** Programa encerrado com sucesso! ***");
				
		} catch (NullPointerException n) {
			System.err.println("Valor nulo");
			n.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		

	}

}
