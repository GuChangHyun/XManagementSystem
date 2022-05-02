import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ProductManager productmanager = new ProductManager(input);
		int num = -1;
		
		while (num != 6) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Products");
			System.out.println("2. Delete Products");
			System.out.println("3. Edit Products");
			System.out.println("4. View Products");
			System.out.println("5. Search Products");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1~6:");
			num = input.nextInt();
			if (num == 1) {
				productmanager.addProduct();
			} else if (num == 2) {
				productmanager.delProduct();
			} else if (num == 3) {
				productmanager.editProduct();
			} else if (num == 4) {
				productmanager.viewProducts();
			} else if (num == 5) {
				productmanager.searchProducts();
			}else {
				continue;
			}
		}
	}
}