package monster.world;

public class Goblin extends WalkingMonster {

	public Goblin(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.print(this.name + "は");
		System.out.println("ナイフで斬りつける");
	}

}
