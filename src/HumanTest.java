
public class HumanTest {

	public static void main(String[] args) {
		Human Ryan = new Human();
		Human Cody = new Human();
		
		System.out.println(Cody.health);
		
		Ryan.attack(Cody);
		
		System.out.println(Cody.health);
	}

}
