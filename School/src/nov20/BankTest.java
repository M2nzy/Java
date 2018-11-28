package nov20;

abstract class BankAccount {

	String AccountNum;
	String name;

	int money = 0;

	BankAccount(String AccountNum, String name, int money) {
		this.AccountNum = AccountNum;
		this.name = name;
		this.money = money;
	}

	void InsertMoney(int money) {
		this.money += money;
	}

	void DelMoney(int money) throws Exception {
		if (this.money < money)
			throw new Exception("No Money!!!");
		else
			this.money -= money;
	}

}

class CardBankAccount extends BankAccount {

	String cardNo;

	CardBankAccount(String AccountNum, String name, String cardNo, int money) {

		super(AccountNum, name, money);
		this.cardNo = cardNo;

	}

	void pay(String cardNo, int money) throws Exception {

		if (this.cardNo.equals(cardNo) && this.money >= money) {
			this.DelMoney(money);
		}

		else {
			throw new Exception("Noooo");
		}

	}

}

class MinusBankAccount extends BankAccount {

	int minus;

	MinusBankAccount(String AccountNum, String name, int money, int minus) {
		super(AccountNum, name, money);
		this.minus = minus;
	}

	void DelMoney(int money) throws Exception {

		if ((this.minus + this.money) > money) {
			this.money -= money;
		}

		else {
			throw new Exception("인출 불가능");
		}

	}

}

class BonusPointAccount extends BankAccount {

	double point;

	BonusPointAccount(String AccountNum, String name, int money) {
		super(AccountNum, name, money);
		this.point = 0;
	}

	void InsertMoney(int money) {
		super.InsertMoney(money);
		this.point += (money * 0.001);
	}

}

public class BankTest {
	public static void main(String args[]) {

		CardBankAccount p1 = new CardBankAccount("111-22", "Gil Dong Hong", "555-666", 0);
		MinusBankAccount p2 = new MinusBankAccount("000-11", "Seon Dal Kim", 10, 2000);
		BonusPointAccount p3 = new BonusPointAccount("333-33", "Mi Young Kim", 0);

		try {

			System.out.println("***** Gil Dong Hong *****");
			p1.InsertMoney(100000);
			int cardpay = 47000;
			p1.pay("555-666", cardpay);
			System.out.println("Pay : " + cardpay);
			System.out.println("Money : " + p1.money);
			System.out.println("");

			System.out.println("***** Seon Dal Kim *****");
			int minuspay = 50;
			p2.DelMoney(minuspay);
			System.out.println("Pay : " + minuspay);
			System.out.println("Money : " + p2.money);
			System.out.println("Minus : " + p2.minus);
			System.out.println("");

			System.out.println("***** Mi Young Kim *****");
			p3.InsertMoney(1000000);
			System.out.println("Money : " + p3.money);
			System.out.println("Point : " + p3.point);

		} catch (Exception e) {

			String msg = e.getMessage();
			System.out.println(msg);

		}

		/*
		 * BankAccount p1 = new BankAccount("111-222", "Young Sik Kim", 200);
		 * BankAccount p2 = new BankAccount("555-666", "Jin Hee Park", 1000);
		 * 
		 * BankAccount ex = new BankAccount("7-77-77", "Dae Park Choi", 10);
		 * 
		 * 
		 * // BankAccount[] p = new BankAccount[2];
		 * 
		 * p1.InsertMoney(1000);
		 * 
		 * try{ ex.DelMoney(100); } catch (Exception e) { String msg = e.getMessage();
		 * System.out.println(msg); // e.printStackTrace(); }
		 * 
		 * printAccount(p1); printAccount(p2);
		 */

	}

	static void printAccount(BankAccount p) {

		System.out.println("Name : " + p.name);
		System.out.println("Account Number : " + p.AccountNum);
		System.out.println("Money : " + p.money);
		System.out.println("");

	}

	// for (int i = 0; i < 2; i++)
	// System.out.println("Name : " + p[i].name + "Account Number : " +
	// p[i].AccountNum + "Money : " + p[i].money);

}
