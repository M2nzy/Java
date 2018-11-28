package nov13;

import java.io.*;

public class FileIO {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("text.txt");
			while (true) {
				int data = reader.read();
				if (data < 0)
					break;
				char ch = (char) data;
				System.out.println(ch);
			}
			reader.close();
		}

		catch (FileNotFoundException fnfe) {
			System.out.println("No File");
		}

		catch (IOException ioe) {
			System.out.println("Can't Read File");
		}
	}
}
