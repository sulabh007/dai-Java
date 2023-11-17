import java.util.Scanner;

public class menu {

	public static void main(String[] args) throws Exception {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		menu_list s1= new menu_list();
		while(true){
		System.out.println("1. Add a new grocery list\n"
				+ "2. Update the quantity of a grocery item in stock\n"
				+ "3. Display all\n"
				+ "4. Remove all empty stock items\n"
				+ "5. Display all product for which stock updated(quantity changed) in last 3 days"
				+ "6. Exit"
				);
		choice = sc.nextInt();
		switch (choice) {
		case 1:
		{
			s1.createItem();
			break;
		}
		case 2: 
		{
			System.out.println("Enter Items's name: ");
			String name = sc.next();
			
			System.out.println("1. Buy the Item\n"
			+"2. Restock the Items\n");
			int quan = sc.nextInt();
			s1.updateQuantity(name, quan);
				
			break;
		}
		case 3:
		{
			s1.displayall();
			break;
		}
		
		case 4: 
		{
			s1.removeEmptyStrock();
			break;
			
		}
		case 5: {
			s1.lastUpdated_in_3days();
			break;
		}
		case 6: {
			System.exit(0);
		}
		default:
			System.out.println("Invalid Input");
		}
			
		}
	}

}
