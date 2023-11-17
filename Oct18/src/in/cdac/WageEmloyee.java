package in.cdac;

public class WageEmloyee extends Employee {
	private int hours;
	private int rate;
	
	public WageEmloyee() {
		hours=0;
		rate=0;
	}

	public WageEmloyee(int id, String n, int d, int m, int y, int h, int r) {
		super(id,n,d,m,y);
		hours = h;
		rate = r;
	}
	public void show() {
		super.show();
		System.out.println(hours);
		System.out.println(rate);
	}

}
