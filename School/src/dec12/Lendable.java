package dec12;

public interface Lendable {

	abstract void checkOut(String borrower, String date); // borrow	
	abstract void checkIn();
	
}
