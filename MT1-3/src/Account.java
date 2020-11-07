
public class Account {

	protected String username;
	protected double money;
	
	public Account(String username, double balance) {
		this.username=username;
		this.money=balance;
	}

	public String getName() {
		
		return username;
	}

	public double getBalance() {
		return money;

	}
	
	 

}
