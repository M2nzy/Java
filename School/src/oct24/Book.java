package oct24;

import java.util.Scanner;

public class Book {

	String title, author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Book[] p = new Book[2];

		for (int i = 0; i < p.length; i++) {
			String str1, str2;
			System.out.print("Title >>> ");
			str1 = input.nextLine();
			System.out.print("Author >>> ");
			str2 = input.nextLine();

			p[i] = new Book(str1, str2);
		}

		for (int i = 0; i < p.length; i++) {
			System.out.print("(" + p[i].title + "," + p[i].author + ")");
		}

		input.close();

	}

}
