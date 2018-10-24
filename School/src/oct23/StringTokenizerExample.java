package oct23;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str1, str2, str3;

		StringTokenizer stok1 = new StringTokenizer("Apple Pear Peach");
		StringTokenizer stok2 = new StringTokenizer("Hello,World What/?", " ,/", false); // true => print " ,/"

		str1 = stok1.nextToken();
		System.out.println(str1);
		str2 = stok1.nextToken();
		System.out.println(str2);
		str3 = stok1.nextToken();
		System.out.println(str3);

		System.out.println();

		while (stok2.hasMoreTokens()) {
			String str;
			str = stok2.nextToken();
			System.out.println(str);
		}
	}

}
