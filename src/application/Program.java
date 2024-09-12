package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product productInstance = new Product();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Product ª" +(i+1)+ " data:");
			System.out.print("Product type (c/u/i):");
			sc.nextLine();
			String productType = sc.nextLine();
			
			if(productType.equals("c")) {
				System.out.print("Name:");
				String name = sc.nextLine();
				System.out.print("Price");
				double price = sc.nextDouble();
				
				Product product = new Product(name, price);
				productInstance.addListProduct(product);
			}
			else if(productType.equals("u")) {
					System.out.print("Name:");
					String name = sc.nextLine();
					System.out.print("Price:");
					double price = sc.nextDouble();
					System.out.print("Manufacture date(dd/mm/yyy):");
					Date manufactureDate = sdf.parse(sc.next());
					Product product = new UsedProduct(name, price, manufactureDate);
					productInstance.addListProduct(product);
			}else if(productType.equals("i")) {
						System.out.print("Name:");
						String name = sc.nextLine();
						System.out.print("Price:");
						double price = sc.nextDouble();
						System.out.print("Custom fee:");
						double customFee = sc.nextDouble();
						
						Product product = new ImportedProduct(name, price,customFee);
						productInstance.addListProduct(product);
			}
		}
		System.out.println("Price TAGS:");
		for (Product product : productInstance.getListProducts()) {
            System.out.println(product.priceTag());
        }
	sc.close();
	}

}
