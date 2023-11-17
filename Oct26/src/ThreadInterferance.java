class Account
{
	private int balance;
	public Account() {
		balance=10000;
	}
	public synchronized void deposite(int amount)
	{
		System.out.println("Balalnce before deposite : "+balance);
		balance=balance+amount;
		System.out.println("Balalnce after deposite : "+balance);
	}
	public synchronized void withdraw(int amount)
	{
		System.out.println("Balalnce before  withdraw : "+balance);
		balance=balance-amount;
		System.out.println("Balalnce after  withdraw: "+balance);
	}
}
class AccountUser extends Thread
{
	private String name, tot;
	private Account account;
	private int amt;

	
	AccountUser(String name,Account acc, String tot,int amt ) 
	{
		this.name = name;
		this.account = acc;
		this.tot = tot;
		this.amt = amt;
		
	}


	public void run() 
	{
		if(tot.equals("deposite"))
			account.deposite(amt);
		else if(tot.equals("withdraw"))
			account.withdraw(amt);
		
	}
	
}

public class ThreadInterferance {

	public static void main(String[] args) {
		Account account = new Account();
		AccountUser user1=new AccountUser("abc",account,"deposite",1000);
		AccountUser user2=new AccountUser("xyz",account,"withdraw",500);
		user1.start();
		user2.start();
		

	}

}
