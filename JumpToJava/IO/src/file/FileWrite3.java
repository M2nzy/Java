package file;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite3 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("test3.txt");
		for (int i = 0; i < 10; i++) {
			String data = (i + 1) + " 번째 줄입니다.";
			pw.println(data);
		}
		pw.close();
	}
}