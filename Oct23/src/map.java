import java.util.*;
public class map {

	public static void main(String[] args) {
		System.out.println("TreeMap :");
		Map<Integer, String> map=new TreeMap<>();
		
		map.put(101, "Math");
		map.put(105, "Science");
		map.put(104, "English");
		
		System.out.println(map);
		
		Set<Integer> s=map.keySet();
		for(Integer key:s)
		{
			System.out.println(key+" "+map.get(key));
		}
		
		System.out.println();
		System.out.println("HashMap :");
		Map<Integer, String> map1=new HashMap<>();
		
		map1.put(101, "Math");
		map1.put(105, "Science");
		map1.put(104, "English");
		
		System.out.println(map1);
		
		Set<Integer> s1=map1.keySet();
		for(Integer key:s1)
		{
			System.out.println(key+" "+map1.get(key));
		}
		
		System.out.println();
		System.out.println("LinkedHashMap :");
		Map<Integer, String> map11=new LinkedHashMap<>();
		
		map11.put(101, "Math");
		map11.put(105, "Science");
		map11.put(104, "English");
		
		System.out.println(map11);
		
		Set<Integer> s11=map11.keySet();
		for(Integer key:s11)
		{
			System.out.println(key+" "+map11.get(key));
		}
		
		System.out.println();
		System.out.println("Hashtable :");
		Map<Integer, String> map111=new Hashtable<>();
		
		map111.put(101, "Math");
		map111.put(105, "Science");
		map111.put(104, "English");
		
		System.out.println(map111);
		
		Set<Integer> s111=map111.keySet();
		for(Integer key:s111)
		{
			System.out.println(key+" "+map111.get(key));
		}
	}

}
