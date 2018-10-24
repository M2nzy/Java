package oct10;
class AddFish {
	int c;

	public int add(int a, int b) {
		c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		if (a > b) {
			c = a - b;
		} else {
			c = b - a;
		}
		return c;
	}
}

public class AddSub {

	public static void main(String args[]) {
		int result, x, y;
		AddFish A = new AddFish();

		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);

		result = A.add(x, y);
		System.out.println("Add result : " + result);

		result = A.sub(x, y);
		System.out.println("Sub result : " + result);

	}
}