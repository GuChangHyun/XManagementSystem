package Product;

import java.util.Scanner;

public class SpecialtyProduct extends Product {
	
	public SpecialtyProduct(ProductsKind kind) {
		super(kind);
	}
	
	public void printInfo() {
		ProductsKind skind = ProductsKind.specialtyProduct;
		System.out.printf("kind : %s name: %s id: %d manufacturer: %s\n", skind, name, id, manufacturer);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Product Id:");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Product Name:");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N'){
			System.out.print("Is this have a Manufacturer? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Product Manufacturer:");
				String manufacturer = input.next();
				this.setManufacturer(manufacturer);
			}
			else if (answer == 'n' || answer == 'N') {
				this.setManufacturer("");
			}
			else {
			}
		}
	}
}
