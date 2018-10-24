package oct24;

public class Wrapper {

	public static void main(String[] args) {
		
		Integer int1 = new Integer(10);
		Integer int2 = new Integer(10);
		
		if(int1.equals(int2))
			System.out.println("SAME");
		else System.out.println("DIFFERENT");
		
		double double1= int1.doubleValue();
		
		System.out.println(double1);
		
		
	}

}
