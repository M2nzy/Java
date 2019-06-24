package dec12;

public class AppCDInfo extends CDInfo implements Lendable {

	String borrower;
	String checkOutdate;
	byte state = 0;

	AppCDInfo(String regNO, String title) {
		super(regNO, title);
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (this.state != 0)
			return;
		this.state = 1;
		this.checkOutdate = date;
		System.out.println("**********************");
		System.out.println("Borrow <" + title + ">");
		System.out.println("Date : " + date);
		System.out.println("Borrower : " + borrower);
		System.out.println("**********************");
		System.out.println("");
	}

	@Override
	public void checkIn() {
		this.state = 0;
		this.checkOutdate = "";
		System.out.println("Return <" + title + ">");
	}
}
