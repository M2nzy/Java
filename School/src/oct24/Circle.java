package oct24;

public class Circle {

	int r;

	Circle(int r) {
		this.r = r;
	}

	double getArea() {
		return this.r * this.r * 3.14;
	}

	public static void main(String[] args) {

		Circle c = new Circle(2);
		System.out.println("Area : " + c.getArea());

	}

}
