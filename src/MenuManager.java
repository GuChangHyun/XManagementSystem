import java.util.Scanner;

public class MenuManager
{
	public static void main(String[] args)
	{
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6)
		{
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Products");
			System.out.println("2. Delete Products");
			System.out.println("3. Edit Products");
			System.out.println("4. View Products");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1~6:");
			num = input.nextInt();
			if (num == 1)
			{
				addProduct();
			}
			else if (num == 2)
			{
				delProduct();
			}
			else if (num == 3)
			{
				editProduct();
			}
			else if (num == 4)
			{
				viewProduct();
			}
			else if (num == 5)
			{
				System.out.println("5");
			}
			else if (num == 6)
			{
				System.out.println("6");
			}
			else
			{
				continue;
			}
		}
	}
	
	public static void addProduct()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Product Id:");
		int ProductId = input.nextInt();
		System.out.println(ProductId);
		System.out.print("Product Name:");
		String ProductName = input.next();
		System.out.println(ProductName);
		System.out.print("Product Manufacturer:");
		String ProductManufacturer = input.next();
		System.out.println(ProductManufacturer);
	}
	public static void delProduct()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Product Id:");
		int ProductId = input.nextInt();
		System.out.print("Product Name:");
		String ProductName = input.next();
		System.out.print("Product Manufacturer:");
		String ProductManufacturer = input.next();
	}
	public static void editProduct()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Product Id:");
		int ProductId = input.nextInt();
	}
	public static void viewProduct()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Product Id:");
		int ProductId = input.nextInt();
	}
}