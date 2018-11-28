package nov20;

class Inventory {

	String ProductCode;
	int count = 0;

	Inventory(String ProductCode, int count) {
		this.ProductCode = ProductCode;
		this.count = count;
	}

	void AddCount(int num) {
		count += num;
	}

	void SubCount(int num) {
		if (count < num)
			count = 0;
		else count -= num;
	}

	void PrintCode() {
		System.out.println("Product Code : " + ProductCode);
	}

	void PrintCount() {
		System.out.println("Product Count : " + count);
	}
}

public class InventoryEx {

	public static void main(String args[]) {

		Inventory obj = new Inventory("52135", 200);
		obj.PrintCode();
		obj.PrintCount();

	}

}