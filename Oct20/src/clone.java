class Circle1 implements Cloneable
{
	private int radius;
	public Circle1() 
	{
		radius=1;
	}
	public Circle1(int r)
	{
		radius=r;
	}
	public double calcArea()
	{
		return 3.142*radius*radius;
	}
	public double calPeri() 
	{
		return 2*3.142*radius;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class clone {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Circle1 c1=new Circle1(11);
		Circle1 c2=(Circle1)c1.clone();
		System.out.println(c2.calcArea());
	}

}
