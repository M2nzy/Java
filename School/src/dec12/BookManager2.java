package dec12;

public class BookManager2 {

	public static void main(String[] args) {
		Lendable obj[] = new Lendable[3];
		obj[0] = new SepVo("883��", "Ǫ���� ����", "����");
		obj[1] = new SepVo("609.2", "����̼���", "���긮ġ");
		obj[2] = new AppCDInfo("02-17", "XML");

		checkOutAll(obj, "������", "20060315");
	}

	static void checkOutAll(Lendable obj[], String borrower, String date) {
		for (int i = 0; i < obj.length; i++)
			obj[i].checkOut(borrower, date);
	}

}
