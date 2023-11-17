import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class grocery_items {
	private static int gid=0;
	private int id;
	private String items;
	private double price;
	private int quantity;
	LocalDateTime lastupdated;
	
	public grocery_items(String gn, int q, double p) {
		this.id= countId();
		this.items=gn;
		this.quantity=q;
		this.price=p;
		this.lastupdated = LocalDateTime.now();
	}
	
	public int countId() {
		return gid++;
	}
	
	public String timeFormat(LocalDateTime time) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return time.format(myFormatObj);	
	}

	public int getQuantity() {
		return quantity;
	}

	public void buyProduct(int quantity) {
		this.quantity = this.quantity-quantity;
		this.lastupdated= LocalDateTime.now();
	}
	
	public void restockProduct(int quantity) {
		this.quantity = this.quantity+quantity;
		this.lastupdated= LocalDateTime.now();
	}

	public LocalDateTime getLastupdated() {
		return lastupdated;
	}

//	public void setLastupdated(String str) {
//		this.lastupdated = LocalDateTime.parse(str); 
//	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "grocery items [id=" + id + ", items=" + items + ", price=" + price + ", quantity=" + quantity
				+ ", lastupdated=" + lastupdated + "]";
	}

	public void display()
	{
		System.out.println();
		System.out.println("Id.:"+id);
		System.out.println("Name :"+items);
		System.out.println("Price :"+price);
		System.out.println("Quantity :"+quantity);
		System.out.println("Last time updated : "+timeFormat(lastupdated));
		System.out.println();
			
	}
}
