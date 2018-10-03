
public class GardenCat extends Cat {
	// Constructor
	public GardenCat(String name) {
		this.SetName(name);
	}

	public static void main(String[] args) {
		GardenCat gardencat = new GardenCat("Nana");
		System.out.println(gardencat.name);
	}
}
