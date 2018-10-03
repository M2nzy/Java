
class Singleton {
	private static Singleton one;

	private Singleton() {

	}

	public static Singleton GetInstance() {
		if (one == null)
			one = new Singleton();
		return one;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.GetInstance();
		Singleton singleton2 = Singleton.GetInstance();
		System.out.println(singleton1 == singleton2);
	}
}