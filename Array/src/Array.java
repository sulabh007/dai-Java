import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50}; //initialized 1D array
		int [] b=new int[] {5,4,3,2,1}; //initilized 1D array
		int [] c=new int[7]; //uninitialzed 1D array
				
					
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array elements");
		for(int i=0; i<c.length; i++)
				c[i]=sc.nextInt();
		System.out.println("Array-");
		for(int i=0; i<c.length; i++)
			System.out.print(c[i]+" ");
		
		System.out.println();
		
		for(int val:c)   		//only printing of array is possible using this loop not scanning.
		{
			System.out.print(val+" ");
		}
	}

}
