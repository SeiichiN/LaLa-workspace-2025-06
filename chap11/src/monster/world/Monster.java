package monster.world;

public abstract class Monster {
	int hp;
	int mp;
	String name;
	
	public Monster(String name) {
		this.name = name;
		hp = 100;
		mp = 50;
	}
	
	public abstract void attack();
	
	public abstract void run();
}
