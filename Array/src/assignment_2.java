/*Write a program to find maximum and minimum numbers from a 1d array without soritng
 * the array.*/


import java.util.Scanner;
public class assignment_2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arraysize=sc.nextInt();
		int [] a=new int[arraysize];
		System.out.println("Enter elements for an array");
		for(int i=0; i<arraysize; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if (a[i] > max){
				max=a[i];
			}
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Min :"+min);
		System.out.println("Max :"+max);
	}

}
