class FirstThread extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("First Thread Running..");
		}
	}
}

class SecondThread extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("Second Thread Running..");
		}
	}
}
public class Multi_Threading_Demo {

	public static void main(String[] args) {
		FirstThread ft = new FirstThread();
		SecondThread st = new SecondThread();
		ft.start();
		st.start();

	}

}
