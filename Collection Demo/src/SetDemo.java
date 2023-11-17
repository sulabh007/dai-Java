import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(13);
		s.add(10);
		s.add(123);
		s.add(13);
		s.add(1);
		s.add(15);
		s.add(15);
		System.out.println("HashSet:\n"+s);
		
		Set<Integer> s1=new LinkedHashSet<>();
		s1.add(13);
		s1.add(10);
		s1.add(123);
		s1.add(13);
		s1.add(1);
		s1.add(15);
		s1.add(15);
		System.out.println("LinkedHashSet:\n"+s1);
		
		Set<Integer> s2=new TreeSet<>();
		s2.add(13);
		s2.add(10);
		s2.add(123);
		s2.add(13);
		s2.add(1);
		s2.add(15);
		s2.add(15);
		System.out.println("TreeSet:\n"+s2);
	}

}
