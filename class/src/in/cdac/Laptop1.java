package in.cdac;
public class Laptop1
{
	private int srno;
	private String make;
	private double cost;
	private static int cnt;
	
	public Laptop1()
	{
		srno=101;
		make="hp";
		cost=30000;
		cnt++;
	}
	public Laptop1(int sno, String m, double c)
	{
		this.srno=sno;
		this.make=m;
		this.cost=c;
		this.cnt++;
	}
	public void show() {
		System.out.println(srno+" "+make+" "+cost);
	}
	public static void showCnt() {
		System.out.println("Number of objects "+cnt);
	}
	public String toString() {
		return srno+" "+make+" "+cost;
	}
	
}

