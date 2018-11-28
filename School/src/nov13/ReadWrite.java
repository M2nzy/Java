package nov13;
import java.io.*;

public class ReadWrite {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		FileReader reader = null;
		
		try {
			
			reader = new FileReader("text.txt");
			writer = new FileWriter("output.txt");
			
			char ch[] = new char[100];
			
			reader.read(ch);
			writer.write(ch);
			
			reader.close();
			writer.close();
			
		} catch(FileNotFoundException fnfe) {
			
			System.out.println("Not Found File");
			
		} catch(IOException ioe) {
			
			System.out.println("Can't Read File");
		
		}
		
	}

}
