package dec04;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPcheck {

	public static void main(String[] args) {
		String hostname = "www.yu.ac.kr";
		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP Address : " +address.getHostAddress());
		} catch(UnknownHostException e) {
			System.out.println("Not Found IP Address");
		}
	}

}
