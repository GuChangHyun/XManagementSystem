package Product;

import java.util.Scanner;

public interface ProductInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setManufacturer(String manufacturer);
	
	public void printInfo();
	
	public Object getName();
	
	public void getUserInput(Scanner input);
}
