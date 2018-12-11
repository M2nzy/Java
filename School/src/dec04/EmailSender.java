package dec04;

import nov28.MessageSender;

public class EmailSender extends MessageSender {

	String sendAddr, emailBody;

	EmailSender(String title, String sendName, String emailBody, String sendAddr) {
		super(title, sendName);
		this.emailBody = emailBody;
		this.sendAddr = sendAddr;
	}

	public void sendMsg(String recipnt) {

		System.out.println("------------------------------");
		System.out.println("To. " + recipnt);
		System.out.println("Title : " + title);
		System.out.println("Content : " + emailBody);
		System.out.println("From. : " + sendName + " " + sendAddr);

	}

}
