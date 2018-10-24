package oct23;

import java.util.Scanner;

public class InformationScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("input this format : name age weight address >>> ");
		String name = input.next();
		int age = input.nextInt();
		double weight = input.nextDouble();
		String address = input.nextLine();

		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("weight : " + weight);
		System.out.println("address : " + address);
		input.close();
	}

}
