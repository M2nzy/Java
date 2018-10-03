
public class Test3 {
	public void sayName(String name) {
		try {
			if ("fool".equals(name)) {
				throw new FoolException();
			}
			System.out.println("당신의 별명은 " + name + " 입니다.");
		} catch (FoolException e) {
			System.err.println("FoolException이 발생했습니다.");
		}
	}

	public static void main(String[] args) {
		Test3 test = new Test3();
		test.sayName("fool");
		test.sayName("genious");
	}

}
