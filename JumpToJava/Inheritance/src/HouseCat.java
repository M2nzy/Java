
public class HouseCat extends Cat {
	public void sleep() { // Method Overriding
		System.out.println(name + " Zzz in house");
	}

	public void sleep(int hour) { // Method Overloading
		System.out.println(name + " Zzz in house for " + hour + " hours");
	}

	public static void main(String[] args) {
		HouseCat housecat = new HouseCat();
		housecat.SetName("lala");
		housecat.sleep();
		housecat.sleep(7);
	}
}
