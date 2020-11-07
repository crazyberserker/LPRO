
public class User {
	
	String username;

	public User(String string) {
		this.username=string;
	}

	public String getName() {
		return username;
	}
	
	public boolean equals(Object o) {
		if(o instanceof User){
			User aux= (User)o;
			return aux.username==username;
		}
		return false;
		
	}

}
