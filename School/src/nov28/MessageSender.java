package nov28;

public abstract class MessageSender {

	protected String title;
	protected String sendName;

	protected MessageSender(String title, String sendName) {
		this.title = title;
		this.sendName = sendName;
	}

	public abstract void sendMsg(String recipnt);

}