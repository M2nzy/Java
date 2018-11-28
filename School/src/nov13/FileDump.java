package nov13;

import java.io.*;

public class FileDump {

	public static void main(String[] args) {

		FileInputStream in = null;
		try {

			in = new FileInputStream("output.dat");
			byte arr[] = new byte[16];

			while (true) {

				int num = in.read(arr);

				if (num < 0)
					break;

				for (int i = 0; i < num; i++)
					System.out.printf("%02X ", arr[i]);
				System.out.println();

			}

		} catch (FileNotFoundException fnfe) {

			System.out.println("No File");

		} catch (IOException ioe) {

			System.out.println("Can't write file");

		} finally {
			try {

				in.close();

			} catch (Exception e) {

			}
		}

	}

}
