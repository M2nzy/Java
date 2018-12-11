package dec05;

import java.io.*;
import java.net.*;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("165.229.125.108", 9000);

			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();

			String str = "Hello, Server";
			out.write(str.getBytes());

			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));

		} catch (Exception e) {
			
			System.out.println(e.getMessage());
	
		} finally {
			try {
				
				socket.close();

			} catch (Exception ignored) {
			}
		}

	}

}
