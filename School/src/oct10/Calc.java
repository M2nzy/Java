package oct10;

class AddSubCalc {
	int Add(int x, int y) {
		return x + y;
	}

	int Sub(int x, int y) {
		return x - y;
	}
}

class FourCalc extends AddSubCalc {

	int Mul(int x, int y) {
		return x * y;
	}

	int Div(int x, int y) {
		return x / y;
	}

}

public class Calc {
	
	public static void main(String args[]) {
		FourCalc calc = new FourCalc();
		int x = 10, y = 5;
		
		System.out.println("Add : " + calc.Add(x, y));
		System.out.println("Sub : " + calc.Sub(x, y));
		System.out.println("Mul : " + calc.Mul(x, y));
		System.out.println("Div : " + calc.Div(x, y));

	}
}