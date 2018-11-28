package nov07;

class Calc {
	private int x, y;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void add(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public void add(int x, double y) {
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public String toString() {
		String str = "Add(" + x + ", " + y + ")";
		return str;
	}
}

public class MethodEx {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.setX(5);
		calc.setY(5);
		System.out.println(calc.toString());

	}

}
