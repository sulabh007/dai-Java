import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class MyException extends Exception{
	String message;
	public MyException(String message) {
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}

public class menu_list {
	
	private static List<grocery_items> list=new LinkedList<grocery_items>();
	
	Scanner sc = new Scanner(System.in);
	
	public void createItem() {
		System.out.println("Enter New Grocery Items: ");
		System.out.println("Enter Name of Grocery Items: ");
		String name = sc.next();
		System.out.println("Enter Quantity of Grocery Items: ");
		int q = sc.nextInt();
		System.out.println("Enter Price of Grocery Items: ");
		double p = sc.nextDouble();
		grocery_items g= new grocery_items(name, q, p);
		list.add(g);
	}
	
	public void displayall() {
		for(grocery_items s:list) {
			s.display();
		}
	}


	public void updateQuantity(String name, int quan) throws Exception{
		for(grocery_items g:list) {
			try {
				if(g.getItems().equals(name))
				{
					switch (quan) 
					{
						case 1:
						{
							System.out.println("Enter Quantity of Grocery Items to buy: ");
							int q = sc.nextInt();
							if(g.getQuantity()<q) {
								throw new MyException("Insufficient Quantity");
							}
							else {
								g.buyProduct(q);
					
							}
							break;
						}
						case 2:
						{
							System.out.println("Enter Quantity of Grocery Items to Restock: ");
							int q = sc.nextInt();
							g.restockProduct(q);

							break;
						}
					}
				}
				else 
				{
					throw new MyException("Item not Found");
				}
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}	
	}

	
	public void removeEmptyStrock() {
		for(grocery_items g:list) {
			if(g.getQuantity()==0) {
				list.remove(g);
			}
		}
		System.out.println("Empty Stock Removed");
		
	}

	public void lastUpdated_in_3days() {
		for(grocery_items g:list) {
			LocalDateTime localDateTime = LocalDateTime.now();
			LocalDateTime three_days=localDateTime.minusDays(3);
			LocalDateTime now=g.getLastupdated();
			if(now.isAfter(three_days)) {
				g.display();
			}
		}
		System.out.println("End of List");
		System.out.println();
	}

	
}