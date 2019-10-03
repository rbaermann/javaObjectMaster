
public class Samurai extends Human {
	public int samuraiCount = 0;
	
	public Samurai () {
		health = 200;
		samuraiCount += 1;
	}
	
	public void deathBlow(Human target) {
		target.health = 50;
		health = health / 2;
	}
	
	public void meditate() {
		health = 200;
	}
	
	public int howMany() {
		System.out.println(samuraiCount);
		return samuraiCount;
	}
}
