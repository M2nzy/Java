package dec12;

public class BookManager {

	public static void main(String[] args) {
		
		SepVo sep = new SepVo("863��774��", "����", "��������");
		sep.checkOut("�迵��", "20060315");
		
		AppCDInfo cd = new AppCDInfo("2005-7001", "Redhat Fedora");
		cd.checkOut("�����", "20060317");

		sep.checkIn();
		cd.checkIn();
		
	}

}
