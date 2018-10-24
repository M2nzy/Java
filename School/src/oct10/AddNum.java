package oct10;

public class AddNum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			// Check type : number?
			boolean isNumeric = args[i].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				int num = Integer.parseInt(args[i]);
				sum += num;
			}
		}
		System.out.println("Result = " + sum);
	}

}
