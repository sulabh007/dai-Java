class Stack<G>
{
	private int size;
	private G [] arr;
	private int top;
	
	public Stack() {
		size=5;
		arr=(G[])  new Object[size];
		top=-1;
	}
	public Stack(int s) {
		size=s;
		arr=(G[])new Object[size];
		top=-1;
	}
	
	public void push(G val)
	{
		if(!isFull())
			arr[++top]=val;
		else
			System.out.println("Overflow!");
	}
	
	public G pop()
	{
		if(!isEmpty())
			return arr[top--];
		else
			System.out.println("Underflow!");
			return null;
	}
	
	public boolean isFull()
	{
		return top==size-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
}
public class Genric_Stack {

	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<>(5);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		System.out.println();
		
		Stack<String> s2=new Stack();
		s2.push("Info");
		s2.push("Wipro");
		s2.push("TCS");
		
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());

	}

}
