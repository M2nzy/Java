
public class Test3 {
	public void sayName(String name) {
		try {
			if ("fool".equals(name)) {
				throw new FoolException();
			}
			System.out.println("����� ������ " + name + " �Դϴ�.");
		} catch (FoolException e) {
			System.err.println("FoolException�� �߻��߽��ϴ�.");
		}
	}

	public static void main(String[] args) {
		Test3 test = new Test3();
		test.sayName("fool");
		test.sayName("genious");
	}

}
