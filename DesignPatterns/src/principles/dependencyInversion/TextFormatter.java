package principles.dependencyInversion;

//Formats Message to plain text
public class TextFormatter implements Formatter {

	@Override
	public String format(Message message) {
		return message.getTimestamp() + ":" + message.getMsg();
	}
}
