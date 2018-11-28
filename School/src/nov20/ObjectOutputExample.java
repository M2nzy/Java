package nov20;

import java.io.*;
import java.util.GregorianCalendar;

public class ObjectOutputExample {

	public static void main(String[] args) {

		ObjectOutputStream out = null;

		try {

			out = new ObjectOutputStream(new FileOutputStream("output.dat"));
			out.writeObject(new GregorianCalendar(2018, 10, 20));

		} catch (IOException ioe) {

			System.out.println("Error");

		} finally {
			try {

				out.close();

			} catch (Exception e) {

			}
		}

	}

}
