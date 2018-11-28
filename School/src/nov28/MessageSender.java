package nov28;

abstract class Message {

	String title, sendName;

	Message(String title, String sendName) {
		this.title = title;
		this.sendName = sendName;
	}

	abstract void send(String recipnt);

}

public class MessageSender {

	public static void main(String[] args) {

	}

}
