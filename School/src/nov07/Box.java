package nov07;

public class Box {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0;

	public Box() {
		idNum = boxID++;
	}

}

class StaDemo {
	public static void main(String args[]) {
		Box mb1 = new Box();
		Box mb2 = new Box();
		Box mb3 = new Box();
		Box mb4 = new Box();
		System.out.println("mb1 ID Number : " + mb1.idNum);
		System.out.println("mb1 ID Number : " + mb2.idNum);
		System.out.println("mb1 ID Number : " + mb3.idNum);
		System.out.println("mb1 ID Number : " + mb4.idNum);
		System.out.println("Box Total : " + Box.boxID);
	}
}