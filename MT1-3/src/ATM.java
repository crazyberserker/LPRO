
public class ATM {

	protected int id;
	protected String adress;
	protected String banc;
	
	public ATM(int i, String string, String string2) {
		this.id = i;
		this.adress=string;
		this.banc=string2;
	}
	
	public int getID() {
		return id;
	}
	
	public boolean equals(Object o) {
		if(o instanceof ATM) {
			ATM a = (ATM)o;
			return a.id == id && a.adress == adress && a.banc == banc;
		}
		return false;
	}

}
