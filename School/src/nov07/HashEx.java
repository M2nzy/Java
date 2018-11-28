package nov07;

import java.util.HashMap;

public class HashEx {

	public static void main(String[] args) {

		HashMap<String, Integer> hashtable = new HashMap<String, Integer>(100);

		hashtable.put("a", 1);
		hashtable.put("B", 2);
		hashtable.put("C", 3);
		hashtable.put("D", 4);
		hashtable.put("E", 5);

		int num = hashtable.get("C");

		System.out.println("C index : " + num);

	}

}
