package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("test2.txt");
		for (int i = 0; i < 10; i++) {
			String data = (i + 1) + " 번째 줄 입니다.\r\n";
			fw.write(data);
		}
		fw.close();
	}
}
