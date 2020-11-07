
public class Deposit extends Mov {
	
	
	
	public Deposit(ATM atm, Session s, Card c, int i) {
		super(atm,s,c,i);
		this.type= "Deposit";
	}


	public void setAmount(double d) {
		this.d=d;
		
	}

	public double getAmount() {
	
		return d;
	}
	

}
