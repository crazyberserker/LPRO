import java.util.Locale;

public class Mov {

	protected ATM A; 
	protected Session s;
	protected Card c;
	int i;
	double d;
	String type;
	
	public Mov(ATM atm, Session s, Card c, int i) {
		this.A=atm;
		this.s=s;
		this.c=c;
		this.i=i;
		
	}
	
	public String toString() {
		return type + " at ATM " + A.getID() + " (" + A.adress + ", " + A.banc + ") of " + String.format(Locale.US, "%.2f", d);
	}
}
