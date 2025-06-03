package monster.world;

public abstract class FlyingMonster extends Monster {

	public FlyingMonster(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("バサバサ飛んで逃げる");
	}

}
