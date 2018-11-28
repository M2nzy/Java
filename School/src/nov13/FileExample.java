package nov13;

import java.io.*;

public class FileExample {

	public static void main(String[] args) {

		File file = new File("C:/");
		File arr[] = file.listFiles();
		
		for (int i = 0; i < arr.length; i++) {
			String name = arr[i].getName();
			
			if (arr[i].isFile())
				System.out.printf("%-25s %7d\n", name, arr[i].length());
			
			else
				System.out.printf("%-25s  <DIR>\n", name);
			
		}

	}

}
