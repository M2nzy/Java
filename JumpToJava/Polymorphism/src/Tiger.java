
public class Tiger extends Animal implements Barkable,Predator {
	public void bark() {
		System.out.println("����");
	}
	
	public String GetFood() {
		return "apple";
	}
}
