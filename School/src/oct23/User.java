package oct23;

public class User {

	int code;
	String name;

	// Constructor
	User(int code, String name) {
		this.code = code;
		this.name = name;
	}

	void output() {
		System.out.println(code + " - " + name);
	}

}

class main {
	public static void main(String[] args) {
		User user1 = new User(1111, "Kim");
		User user2 = new User(2222, "Lee");
		user1.output();
		user2.output();
	}
}
