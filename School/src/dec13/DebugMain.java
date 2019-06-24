package dec13;

public class DebugMain {

	public static void main(String[] args) {

		int x = 100, y = 200;
		x++;
		x++;
		System.out.println(x);
		prtAdd(y);

	}

	static void prtAdd(int z) {
		z++;
		z++;
		System.out.println(z);
	}

}
