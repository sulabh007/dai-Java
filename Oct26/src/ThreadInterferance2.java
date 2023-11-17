//this method is more Efficient for long codes

class Account1
{
	private int balance;
	public Account1() {
		balance=10000;
	}
	public void deposite(int amount)
	{
		synchronized (this) 
		{
			System.out.println("Balalnce before deposite : "+balance);
			balance=balance+amount;
			System.out.println("Balalnce after deposite : "+balance);
		}
		
	}
	public void withdraw(int amount)
	{
		synchronized (this) 
		{
			System.out.println("Balalnce before  withdraw : "+balance);
			balance=balance-amount;
			System.out.println("Balalnce after  withdraw: "+balance);
		}
		
	}
}
class Account1User1 extends Thread
{
	private String name, tot;
	private Account1 Account1;
	private int amt;

	
	Account1User1(String name,Account1 acc, String tot,int amt ) 
	{
		this.name = name;
		this.Account1 = acc;
		this.tot = tot;
		this.amt = amt;
		
	}


	public void run() 
	{
		if(tot.equals("deposite"))
			Account1.deposite(amt);
		else if(tot.equals("withdraw"))
			Account1.withdraw(amt);
		
	}
	
}

public class ThreadInterferance2 {

	public static void main(String[] args) {
		Account1 Account1 = new Account1();
		Account1User1 user1=new Account1User1("abc",Account1,"deposite",1000);
		Account1User1 user2=new Account1User1("xyz",Account1,"withdraw",500);
		user1.start();
		user2.start();
		

	}

}
