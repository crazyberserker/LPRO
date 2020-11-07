

public class Shout extends MessageFormatter {

	@Override
	public String format(String msg) {
		return msg.toUpperCase();
	}

}