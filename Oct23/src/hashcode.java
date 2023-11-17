import java.util.Objects;
import java.util.*;

class Product implements Comparable<Product>
{
	private int pid;
	String name;
	double cost;
	
	public Product(int pid, String name, double cost) 
	{
		super();
		this.pid = pid;
		this.name = name;
		this.cost = cost;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, name, pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && Objects.equals(name, other.name)
				&& pid == other.pid;
	}

	public void display() {
		System.out.println("pid=" + pid + ", name=" + name + ", cost=" + cost); 
	}

	@Override
	public int compareTo(Product o) {
		if(this.cost > o.cost)
			return 1;
		else if (this.cost < o.cost)
			return -1;
		else
			return 0;
	}
	
	
}
public class hashcode {

	public static void main(String[] args) {
		Set<Product> s=new TreeSet<>();
		s.add(new Product(51,"Marker",60));
		s.add(new Product(52,"Projector",40000));
		s.add(new Product(53,"Keyboard",500));
		s.add(new Product(53,"Keyboard",500));
		
		for(Product p:s)
		{
			p.display();
		}

	}

}
