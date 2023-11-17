import java.util.*;
import java.util.List;
class Laptop implements Comparable<Laptop>
{
	private int srno;
	private String make;
	private double cost;
	
	public Laptop()
	{
		srno=101;
		make="hp";
		cost=30000;
	}
	public Laptop(int sno, String m, double c)
	{
		this.srno=sno;
		this.make=m;
		this.cost=c;
	}
	public void display() 
	{
		System.out.println(srno+" "+make+" "+cost);
	}

	public int getSrno() {
		return srno;
	}
	public String toString() {
		return srno+" "+make+" "+cost;
	}
	@Override
	public int compareTo(Laptop o)
	{
		if(this.cost > o.cost)
			return 1;
		else if(this.cost < o.cost)
			return -1;
		else 
			return 0;
	}
	
}
class CompareLaptops implements Comparator<Laptop>
{
	@Override
	public int compare(Laptop o1, Laptop o2)
	{
		if(o1.getSrno()>o1.getSrno())
			return 1;
		else if(o1.getSrno()<o2.getSrno())
			return -1;
		else
			return 0;
			
	}
}

public class Comparable_for_arraylist {

	public static void main(String[] args) {
		List<Laptop> list=new ArrayList<>();
		list.add(new Laptop(101,"hp",45000));
		list.add(new Laptop(12,"apple",75000));
		list.add(new Laptop(113,"lenovo",30000));
		
		for(Laptop l:list)
			l.display();
	
		//Collections.sort(list);
		Collections.sort(list,new CompareLaptops());
		System.out.println();
		
		for(Laptop l:list)
			l.display();

	}

}
