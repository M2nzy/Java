package dec12;

public class SepVo implements Lendable {

	String regNO;
	String bookTitle;
	String writer;
	byte state = 0;

	SepVo(String regNO, String bookTitle, String writer) {
		this.regNO = regNO;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	public void checkOut(String borrower, String date) {
		if (state != 0)
			return;
		this.state = 1;		
		System.out.println("**********************");
		System.out.println("Borrow <" + bookTitle + ">");
		System.out.println("Date : " + date);
		System.out.println("Borrower : " + borrower);
		System.out.println("**********************");
		System.out.println("");
	}

	public void checkIn() {
		this.state = 0;
		System.out.println("Return <" + bookTitle + ">");
	}
}
