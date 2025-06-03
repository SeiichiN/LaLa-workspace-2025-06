package monster.world;

public class DeathBat extends FlyingMonster {

	public DeathBat(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.print(this.name + "は");
		System.out.println("突っつく");
	}

}
