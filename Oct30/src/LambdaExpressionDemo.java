import java.util.*;
import java.util.stream.Stream;

interface C
{
	public void show();
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		C a= () -> System.out.println("this is lambda syntax..");
		a.show();
		
		List<Integer> list= Arrays.asList(23,100,10,1,45,600);
		list.forEach((x) -> System.out.print(x+" ")); //printing using lambda
		System.out.println();
		
		Stream<Integer> stream=list.stream();
		long cnt=stream.count();
		System.out.println("Number of values :"+cnt);
		System.out.println();
		
//		stream.forEach(x) -> System.out.println(x+" ");
//		System.out.println();
		
		list.stream().map((t) -> t*2).forEach((t)->System.out.println(t+" "));//doubling each element of ArrayList
		System.out.println();
		
		list.stream().filter((t)-> (t%2==1)).forEach((t)->System.out.println(t+" "));//printing only odd values,
	}
}
