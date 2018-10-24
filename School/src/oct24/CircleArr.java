package oct24;

public class CircleArr {

	public static void main(String[] args) {

		Circle[] arr = new Circle[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Circle(i);
			System.out.println("[" + i + "] Area : " + (int) arr[i].getArea());
		}

	}

}
