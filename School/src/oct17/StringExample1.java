package oct17;

public class StringExample1 {

	public static void main(String[] args) {
		String str = "Java";
		int len = str.length();
		System.out.println(len);
		for (int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt);
			System.out.println(ch);
		}
	}

}
