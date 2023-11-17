import java.util.Scanner;

public class Tester
{
	public static void main(String [] args)
	{
		int a, b, c, d, e;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter five numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
       	c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
		
		float avg = (a+b+c+d+e)/5;
		
		System.out.println("Avg = "+avg);
		
	}
}
//ctrl+space => autocomplete
//ctrl+click => jumping to defination