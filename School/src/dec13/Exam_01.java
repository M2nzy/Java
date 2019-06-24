package dec13;

class Exam_01_Sub {

	private int x = 100;
	private char y = 'A';

	public void viewX() {
		System.out.println(x);
	}
	
	public void viewY() {
		System.out.println(y);
	}
	
	public int getX() {
		return x;
	}

	public char getY() {
		return y;
	}

}

public class Exam_01 {

	public static void main(String[] args) {

		Exam_01_Sub a = new Exam_01_Sub();
		System.out.println(a.getX());
		System.out.println(a.getY());

		a.viewX();
		a.viewY();
	}

}
