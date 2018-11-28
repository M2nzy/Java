package nov21;

class A {
	int x = 10;

	A() {
		System.out.println("A class object");
	}

	public void printA() {
		System.out.println("method A");
	}
}

class B extends A {
	B() {
		System.out.println("B class object");
	}

	public void printA() {
		System.out.println("Overriding A");
	}

	public void printB() {
		System.out.println("method B");
	}
}

class C extends A {
	C() {
		System.out.println("C class object");
	}

	public void printA() {
		System.out.println("C class Overriding");
		;
	}
}

public class ObjectEx {

	public static void main(String[] args) {

		A c = new B();
		c.printA();

		A a = new A();
		a.printA();

		A d = new C();
		d.printA();

//		B b = new B();
//		b.printA();
//		b.printB();
//		System.out.println(b.x);

	}

}
