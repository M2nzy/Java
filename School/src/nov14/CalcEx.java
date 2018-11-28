package nov14;

class Calc {
	static int abs(int x) {
		return (x > 0)? x : -x;
	}

	static int max(int x, int y) {
		return (x > y)? x : y;
	}

	static int min(int x, int y) {
		return (x < y)? x : y;
	}
}

public class CalcEx {

	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}

}
