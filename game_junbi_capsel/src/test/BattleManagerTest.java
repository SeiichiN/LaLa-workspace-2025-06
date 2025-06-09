package test;

import main.BattleManager;
import main.Goblin;
import main.Hero;

public class BattleManagerTest {

	public static void main(String[] args) {
		Hero h = new Hero("勇者", '@');
		Goblin g = new Goblin("ゴブリン", 'g');
		BattleManager bm = new BattleManager();
		bm.fight(h, g);

	}

}
