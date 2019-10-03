
public class Human {
	public int health;
	public int strength;
	public int stealth;
	public int intelligence;
	
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	
	public void attack(Human target) {
		target.health -= strength;
	}
}
