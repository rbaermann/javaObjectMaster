
public class Ninja extends Human {
	public int stealth;
	
	public Ninja() {
		stealth = 10;
	}
	
	public void steal(Human target) {
		target.health -= stealth;
	}
	
	public void shadowStep() {
		System.out.println("The Ninja has disappeared into thin air... He has fled");
		health -= 10;
	}
}
