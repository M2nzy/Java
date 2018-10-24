package oct23;

public class GoodsTest {

	public static void main(String[] args) {
		Goods cam = new Goods();
		cam.name = "Nikon";
		cam.price = 400000;
		cam.numOfStock = 30;
		cam.sold = 50;

		System.out.println("*** cam ***");
		System.out.println("name : " + cam.name);
		System.out.println("price : " + cam.price);
		System.out.println("numOfStock : " + cam.numOfStock);
		System.out.println("sold : " + cam.sold);
	}

}
