package nov20;

class Numbers {
	int getSum(int arr[]) {

		int tot = 0;
		for (int i = 0; i < arr.length; i++)
			tot += arr[i];
		return tot;

	}

	double getAvr(int arr[]) {

		double avr = 0;
		avr = this.getSum(arr);
		avr /= (arr.length);
		return avr;

	}

}

public class MathEx {

	public static void main(String[] args) {

		System.out.println("***** Start *****");
//		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int arr[] = new int[0];

		Numbers num = new Numbers();
		try {
			int tot = 0;
			double avr = 0;

			tot = num.getSum(arr);
			avr = num.getAvr(arr);

			System.out.println("sum = " + tot);
			System.out.println("average : " + avr);

		} catch (ArithmeticException e) {

			System.out.println("div 0 Error");

		}

		System.out.println("***** End *****");
	}

}
