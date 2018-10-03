package file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("test.txt");
		for (int i = 0; i < 10; i++) {
			String data = (i + 1) + " 번째 줄 입니다.\r\n";
			output.write(data.getBytes());
		}
		output.close();
	}
}
