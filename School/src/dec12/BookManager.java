package dec12;

public class BookManager {

	public static void main(String[] args) {
		
		SepVo sep = new SepVo("863¤²774°³", "°³¹Ì", "º£¸£º£¸£");
		sep.checkOut("±è¿µ¼÷", "20060315");
		
		AppCDInfo cd = new AppCDInfo("2005-7001", "Redhat Fedora");
		cd.checkOut("¹ÚÈñ°æ", "20060317");

		sep.checkIn();
		cd.checkIn();
		
	}

}
