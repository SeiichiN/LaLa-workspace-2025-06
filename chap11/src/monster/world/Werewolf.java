package monster.world;

public class Werewolf extends WalkingMonster {

	public Werewolf(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.print(this.name + "は");
		System.out.println("かみつく");
	}

}
