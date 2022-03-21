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
				System.out.print("ProductId:");
				int ProductId = input.nextInt();
				System.out.print("Product Name:");
				String ProductName = input.next();
			}
			else if (num == 2)
			{
				System.out.println("2");
			}
			else if (num == 3)
			{
				System.out.println("3");
			}
			else if (num == 4)
			{
				System.out.println("4");
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
}