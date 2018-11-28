package nov13;

import java.io.*;

public class FileWrite {

	public static void main(String[] args) {
		FileWriter writer = null;
		
		try {

			writer = new FileWriter("output.txt");
			char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f' };

			for (char c : ch)
				writer.write(c);

		} catch (IOException ioe) {
			
			System.out.println("Can't read file");
	
		} finally {
			try {

				writer.close();

			} catch (Exception e) {

			}
		}
	}

}
