package nov14;

public class Box {

	int width;
	int height;
	int depth;

	public Box() {
		this(1, 1, 1);
//		width = height = depth = 1;
	}

	public Box(int width) {
		this(width, 1, 1);
//		this.width = width;
//		height = 1;
//		depth = 1;
	}

	public Box(int width, int height) {
		this(width, height, 1);
//		width = w;
//		height = h;
//		depth = 1;
	}

	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public static void main(String[] args) {

	}

}
