interface Polygon
{
	public double calArea();
	public double calPeri();
}
class Circle implements Polygon
{
	private int radius;
	
	public Circle() {
		radius=1;
	}
	public Circle (int r)
	{
		radius=r;
	}
	public double calArea()
	{
		return 3.142*radius*radius;
	}
	public double calPeri() 
	{
		return 2*3.142*radius;
	}
}
class Rectangle implements Polygon
{
	private int len,brd;
	public Rectangle()
	{
		len=brd=1;
	}
	public Rectangle(int l, int b) 
	{
		len=l;
		brd=b;
	}
	public double calArea()
	{
		return len*brd;
	}
	public double calPeri() 
	{
		return 2*(len+brd);
	}
}
class Square extends Rectangle
{
	public Square() 
	{
		super();
	}
	public Square(int s)
	{
		super(s,s);
	}
	public double calcArea()
	{
		return super.calArea();
	}
	public double calcPeri()
	{
		return super.calPeri();
	}
}
public class inheritance {

	public static void main(String[] args) {
		Polygon p=new Square(10);
		System.out.println(p.calArea());
		System.out.println(p.calPeri());

	}

}
