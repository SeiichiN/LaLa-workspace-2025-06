package monster.world;

public abstract class WalkingMonster extends Monster {

	public WalkingMonster(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("トコトコ走って逃げる");
		
	}

}
