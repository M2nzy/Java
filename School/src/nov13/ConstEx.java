package nov13;

class Person {

	private int age;
	private double id;

	Person() {
		this(0.3, 25);
//		this.age = age;
//		this.id = id;
	}

	Person(int age, double id) {
		this(id, age);		
//		this.age = age;
//		this.id = id;
	}

	Person(double id, int age) {
		this.age = age;
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age - 1;
	}
}

public class ConstEx {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(10);
		Person p3 = new Person(20, 0.4);
		
	}

}
