package oct17;
class obj {
	int w;
	int h;
	int d;
}

public class Six {

	public static void main(String[] args) {
		obj o1 = new obj();
		obj o2 = new obj();

		o1.w = 20; o1.h = 40; o1.d = 15;
		o2.w = 10; o2.h = 20; o2.d = 30;

		System.out.println("Result 1 : " + (o1.w * o1.h * o1.w));
		System.out.println("Result 2 : " + (o2.w * o2.h * o2.w));
	}

}
