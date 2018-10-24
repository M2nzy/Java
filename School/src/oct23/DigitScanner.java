package oct23;

import java.util.Scanner;

public class DigitScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;

		System.out.print("1st num >>> ");
		num1 = input.nextInt();

		System.out.print("2nd num >>> ");
		num2 = input.nextInt();

		System.out.println("SUM : " + (num1 + num2));

		input.close();
	}

}
