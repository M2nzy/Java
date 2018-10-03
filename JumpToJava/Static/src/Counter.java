
public class Counter {
	static int count = 0;

	Counter() {
		Counter.count++;
		System.out.println(Counter.count);
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
	}

}
