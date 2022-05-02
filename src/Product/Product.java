package Product;

import java.util.Scanner;

public class Product {
	protected ProductsKind kind = ProductsKind.convenienceProduct;
	protected String name;
	protected int id;
	protected String manufacturer;

	public Product() {
	}
	
	public Product(ProductsKind kind) {
		this.kind = kind;
	}

	public Product(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Product(String name, int id, String manufacturer) {
		this.name = name;
		this.id = id;
		this.manufacturer = manufacturer;
	}
	
	public Product(ProductsKind kind, String name, int id, String manufacturer) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.manufacturer = manufacturer;
	}
	
	public ProductsKind getKind() {
		return kind;
	}

	public void setKind(ProductsKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	public void printInfo() {
		ProductsKind skind = ProductsKind.convenienceProduct;
		System.out.printf("kind : %s name: %s id: %d manufacturer: %s\n", skind, name, id, manufacturer);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Product Id:");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Product Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Product Manufacturer:");
		String manufacturer = input.next();
		this.setManufacturer(manufacturer);
	}
}