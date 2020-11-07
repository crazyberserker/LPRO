
public class Message {

	String message;
	MessageFormatter mf = null;

	public Message(String s) {
		message = s;
	}

	public Message(Message m) {
		this.mf = m.mf;
		message = m.message;
	}

	public Object getMessage() {
		if(mf != null) {
			return mf.format(message);
		}
		return message;
	}

	public void setMessage(String s) {
		message = s;
	}

	public void setFormattingStrategy(MessageFormatter mf) {
		this.mf = mf;
	}
	

}
