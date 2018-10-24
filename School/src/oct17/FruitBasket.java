package oct17;
class Fruit {
	int apple = 5;
	int straw = 10;
	int grapes = 15;
}

public class FruitBasket {

	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		Fruit f2 = f1;
		System.out.println("1.");
		System.out.println("f1.apple : " + f1.apple + " f1.straw : " + f1.straw + " f1.grapes : " + f1.grapes);
		System.out.println("f2.apple : " + f2.apple + " f2.straw : " + f2.straw + " f2.grapes : " + f2.grapes);
		
		f2.straw = 30;
		System.out.println("2.");
		System.out.println("f1.apple : " + f1.apple + " f1.straw : " + f1.straw + " f1.grapes : " + f1.grapes);
		System.out.println("f2.apple : " + f2.apple + " f2.straw : " + f2.straw + " f2.grapes : " + f2.grapes);
				
	}

}
