package nov13;

class Box {

	private int width;
	private int height;
	private int depth;
	private int vol;

	Box(int width, int height, int depth) {
		
		this.width = width;
		this.height = height;
		this.depth = depth;
	
	}

	public int getVol() {
		vol =  this.width * this.height * this.depth;
		return vol;
	}
}

public class BoxTestDemo {

	public static void main(String[] args) {
		
		int vol;
		Box mb1 = new Box(10, 20, 30);
		
		vol = mb1.getVol();
		System.out.println("mb1 vol : " + vol);
	
	}

}
