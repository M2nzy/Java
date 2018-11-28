package nov28;

abstract class Animal {
	public abstract void cry();
}

class Cat extends Animal {

	public void cry() {
		System.out.println("³Ä¿Ë");
	}

}

class Dog extends Animal {

	@Override
	public void cry() {
		System.out.println("¸Û¸Û");
	}

}

public class AbstractEx {

	public void cryButtonClick(Animal animal) {
		animal.cry();
	}
	
	public static void main(String[] args) {

		// Cat c = new Cat(); (X)
		// c.cry();

		Animal animal = new Cat();
		// animal.cry();

		AbstractEx example = new AbstractEx();
		example.cryButtonClick(animal);
		
		animal = new Dog();
		example.cryButtonClick(animal);
	
	}

}
