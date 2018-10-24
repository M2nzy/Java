package oct23;

public class MyExp {

	int base, exp;

	int getValue() {
		int value = 1;
		for (int i = 0; i < exp; i++) {
			value *= base;
		}

		return value;
	}

	public static void main(String[] args) {
		MyExp test = new MyExp();
		
		test.base = 2;
		test.exp = 0;
		System.out.println("2^0 = " + test.getValue());
		
		test.exp = 1;
		System.out.println("2^1 = " + test.getValue());
		
		test.exp = 3;
		System.out.println("2^3 = " + test.getValue());
	}

}