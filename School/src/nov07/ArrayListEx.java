package nov07;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("B");

		int num = list.size();

		int index1 = list.indexOf("B");
		int index2 = list.lastIndexOf("B");

		System.out.println("First B : " + index1);
		System.out.println("Last B : " + index2);

		for (int i = 0; i < num; i++) {
			String str = list.get(i);
			System.out.println(str);
		}

	}

}
