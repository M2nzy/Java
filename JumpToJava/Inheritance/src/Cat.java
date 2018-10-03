
public class Cat extends Animal {
	public void sleep() {
		System.out.println(name + " Zzz..");
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.SetName("Nana");
		System.out.println(cat.name);
		cat.sleep();
	}
}
