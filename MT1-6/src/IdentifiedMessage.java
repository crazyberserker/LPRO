
public class IdentifiedMessage extends Message {

	protected String name;
		
	public IdentifiedMessage(String string, String string2) {
		
		super(string2);
		this.name=string;

	}

	public String getMessage() {
		return "[" + name + "]: " + super.getMessage();
	}


	public void setUser(String string) {
		this.name=string;
	}


	public String getUser() {
	
		return name;
	}

}
