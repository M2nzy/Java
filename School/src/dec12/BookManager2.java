package dec12;

public class BookManager2 {

	public static void main(String[] args) {
		Lendable obj[] = new Lendable[3];
		obj[0] = new SepVo("883ㅇ", "푸코의 진자", "에코");
		obj[1] = new SepVo("609.2", "서양미술사", "곰브리치");
		obj[2] = new AppCDInfo("02-17", "XML");

		checkOutAll(obj, "윤지혜", "20060315");
	}

	static void checkOutAll(Lendable obj[], String borrower, String date) {
		for (int i = 0; i < obj.length; i++)
			obj[i].checkOut(borrower, date);
	}

}
