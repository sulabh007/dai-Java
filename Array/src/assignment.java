/*Write a program to reverse the elements of an array entered by user (without using
 * another array). Also accept array size from user. */
import java.util.Scanner;
public class assignment {

	public static void main(String[] args) {
		int temp;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arraysize=sc.nextInt();
		int [] a=new int[arraysize];
		System.out.println("Enter elements for an array");
		for(int i=0; i<arraysize; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array before reversing:");
		for(int val:a)   		
		{
			System.out.print(val+" ");
		}
		System.out.println();
		for(int i=0;i<a.length/2; i++)
		{
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		for(int val:a) 
		{
			System.out.println(val+" ");
		}
		System.out.println();
	}

}
