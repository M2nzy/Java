package dec04;

import nov28.MessageSender;

public class SMSSender extends MessageSender {

	String retPhNo, msg;

	SMSSender(String title, String sendName, String retPhNo, String msg) {
		super(title, sendName);
		this.retPhNo = retPhNo;
		this.msg = msg;
	}

	@Override
	public void sendMsg(String recipnt) {

		System.out.println("------------------------------");
		System.out.println("Title : " + title);
		System.out.println("Send Name : " + sendName);
		System.out.println("Phone number : " + recipnt);
		System.out.println("Return Phone Number : " + retPhNo);
		System.out.println("Message : " + msg);
	}

}
