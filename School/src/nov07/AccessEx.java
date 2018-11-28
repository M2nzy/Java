package nov07;
class Sample {

	public int a;
	private int b;
	int c;

	// Use Generate Getters and Setters
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	/*
	 * void setB(int b) { this.b = b; }
	 * 
	 * int getB() { return this.b; }
	 */

}

public class AccessEx {

	public static void main(String[] args) {

		Sample sample = new Sample();

		sample.a = 10;

//		sample.b = 20; access denied 
		sample.setB(20);
		System.out.println(sample.getB());

		sample.c = 30;

	}

}
