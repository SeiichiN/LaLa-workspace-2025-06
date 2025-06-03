package monster.world;

public class Main {

	public static void main(String[] args) {
		Goblin g = new Goblin("ゴブリン");
		g.attack();
		g.run();
		DeathBat db = new DeathBat("地獄コウモリ");
		db.attack();
		db.run();

	}

}
