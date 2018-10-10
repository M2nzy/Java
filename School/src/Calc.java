
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

public class Calc extends FourCalc {
	
	public static void main(String args[]) {
		Calc calc = new Calc();
		int x = 10, y = 5;
		
		System.out.println("Add : " + calc.Add(x, y));
		System.out.println("Sub : " + calc.Sub(x, y));
		System.out.println("Mul : " + calc.Mul(x, y));
		System.out.println("Div : " + calc.Div(x, y));

	}
}