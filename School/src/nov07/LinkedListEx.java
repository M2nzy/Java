package nov07;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("A");
		list.add("B");
		list.add("C");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}

}
