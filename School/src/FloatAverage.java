
public class FloatAverage {

	public static void main(String[] args) {
		int i, length = 0;
		float result = 0;
		
		length = args.length;
		
		for (i = 0; i < args.length; i++) {
			float num = Float.parseFloat(args[i]);
			result += num;
		}

		result = result / length;
		System.out.println("Result : " + result);
	}
}
