import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector<>();
		System.out.println(v.size() + " "+v.capacity());
		v.add(10);
		System.out.println(v.size() + " "+v.capacity());
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		v.add(90);
		v.add(100);
		System.out.println(v.size() + " "+v.capacity());
		v.add(24);
		System.out.println(v.size() + " "+v.capacity());
		
		System.out.println(v);		//Using toString method
		
		for(Integer val:v)			//Using for-each loop
		{
			System.out.println(val+" ");
		}
		Iterator<Integer> itr=v.iterator();		//Using iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
