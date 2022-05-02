import java.util.ArrayList;
import java.util.Scanner;

import Product.Product;
import Product.ProductsKind;
import Product.ShoppingProduct;
import Product.SpecialtyProduct;

public class ProductManager {
	ArrayList<Product> products = new ArrayList<Product>();
	Scanner input;
	//int[] ar = new int[10];
	//int i = 0;

	ProductManager(Scanner input) {
		this.input = input;
	}

	public void addProduct() {
		int kind = 0;
		Product product;
		while (kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 for convenienceProduct");
			System.out.println("2 for shoppingProduct");
			System.out.println("3 for specialtyProduct");
			System.out.println("Select num for Product Kind 1~3:");
			kind = input.nextInt();
			if (kind == 1) {
				product = new Product(ProductsKind.convenienceProduct);
				product.getUserInput(input);
				products.add(product);
				break;
			}
			else if (kind == 2) {
				product = new ShoppingProduct(ProductsKind.shoppingProduct);
				product.getUserInput(input);
				products.add(product);
				break;
			}
			else if (kind == 3) {
				product = new SpecialtyProduct(ProductsKind.specialtyProduct);
				product.getUserInput(input);
				products.add(product);
				break;
			}
			else {
				System.out.println("Select num for Product Kind 1~3:");
			}
		}
		//ar[i] = product.id;
		//i++;
	}

	public void delProduct() {
		System.out.print("Product Id:");
		int productId = input.nextInt();
		int index = -1;
		for (int i = 0; i<products.size(); i++) {
			if (products.get(i).getId() == productId) {
				index = i;
				break;
				//for(int j=0; j<ar.length; j++) {
				//	if(ar[j] == productId) {
				//		ar[j] = (Integer) null;
				//	}
				//}
				//i--;
			}
		}
		
		if (index >= 0) {
			products.remove(index);
			System.out.println("the product " + productId + " is deleted");
		}
		else {
			System.out.println("the product has not been registered");
			return;
		}
	}

	public void editProduct() {
		System.out.print("Product ID :");
		int productId = input.nextInt();
		for (int i = 0; i<products.size(); i++) {
			Product product = products.get(i);
			if(product.getId() == productId) {
				int num = -1;
				while (num != 4) {
					System.out.println("**Product Info Edit Menu **");
					System.out.println(" 1. Edit Id");
					System.out.println(" 2. Edit Name");
					System.out.println(" 3. Manufacturer");
					System.out.println(" 4. Exit");
					System.out.println("Select one number betwwen 1 - 4");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Product ID : ");
						int id = input.nextInt();
						product.setId(id);
					}
					else if (num == 2) {
						System.out.print("Product Name : ");
						String name = input.next();
						product.setName(name);
					}
					else if (num == 3) {
						System.out.print("Product Manufacturer : ");
						String manufacturer = input.next();
						product.setManufacturer(manufacturer);
					}
					else {
						continue;
					} // if
				} // while
				break;
			} // if
//		System.out.print("Product Id:");
//		int productId = input.nextInt();
//		if (product.id == productId) {
//			System.out.printf("the product to be edited is %d", productId);
		} // for
	}

	public void viewProducts() {
//		System.out.print("Product Id:");
//		int productId = input.nextInt();
		System.out.println("# of registered products :" + products.size());
		for (int i = 0; i<products.size(); i++) {
			products.get(i).printInfo();
		}
//		if (product.id == productId) {
//			product.printInfo();
//			for(int k=0; k<ar.length; k++) {
//				System.out.print(ar[k]);
//			}
//			System.out.println();
//		}
	}
	
	public void searchProducts() {
		input.nextLine();
		System.out.println("찾을 상품의 이름을 입력하세요.");
		String pName = input.nextLine();
		for(Product p : products) {
			if(p.getName().equals(pName)){
				System.out.println("찾으시는 상품 코드는 "+p.getId()+"입니다.");
				return;		
			}
		}
		System.out.println("해당하는 상품은 리스트에 존재하지 않습니다.");
		return;
	}
}
