package oct09;
class A {
	int aa;
	int bb;
	int cc;
	static int s = 0;
}

public class Add {

	public static void main(String[] args) {

		A.s = 3;
		A obja = new A();

		obja.aa = 5;
		obja.bb = obja.aa * 3;
		obja.cc = A.s;
		System.out.println("aa : " + obja.aa);
		System.out.println("bb : " + obja.bb);
		System.out.println("cc : " + obja.cc);
	}

}
