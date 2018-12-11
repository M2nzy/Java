package dec04;

import nov28.MessageSender;

public class MsgTest {

	public static void main(String[] args) {

		// es.sendMsg("hatman@yeyeye.com");
		// es.sendMsg("stickman@hahaha.com");
		// ss.sendMsg("010-123-1234");
		// ss.sendMsg("010-321-4321");

		MessageSender ms = new EmailSender("생일을 축하합니다", "고객센터", "10% 할인 쿠폰이 발행되었습니다.", "admin@dukeeshop.co.kr");
		send(ms, "hatman@yayaya.com");
		send(ms, "stickman@hahaha.com");

		ms = new SMSSender("생일을 축하합니다", "고객센터", "02-000-0000", "10% 할인 쿠폰이 발행되었습니다.");
		send(ms, "010-123-1234");
		send(ms, "010-321-4321");

	}

	static void send(MessageSender obj, String recipnt) {
		obj.sendMsg(recipnt);
	}

}
