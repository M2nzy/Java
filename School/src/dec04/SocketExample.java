package dec04;

import java.net.Socket;
import java.util.*;
import java.io.*;

public class SocketExample {

	public static void main(String[] args) throws Exception {
		
		try(Socket s = new Socket("time-c.nist.gov", 13)){
			InputStream inStream = s.getInputStream();
			Scanner sc = new Scanner(inStream);
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			
			sc.close();
		}
	}
}
