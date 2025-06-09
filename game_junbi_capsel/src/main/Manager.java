package main;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	Board board;
	Goblin goblin;
	Slime slime;
	Potion potion;
	Ether ether;
	Hero hero;
	List<Monster> monsters;
	List<Item> items;
	
	public void start() {
		init();
		MoveManager mm = new MoveManager(hero, monsters, items, board);
		// mm.execute();
		while (true) {
			GameObject gameObject = checkGameObject();
			if (gameObject instanceof Monster) {
				Monster m = (Monster)gameObject;
				System.out.println(m + "が現れた！");
				BattleManager battleManager = new BattleManager();
				battleManager.fight(hero, m);
				checkBattleResult(hero, m);
			}
			if (gameObject instanceof Item) {
				Item i = (Item)gameObject;
				System.out.println(i + "が落ちている！");
				char ch = Util.choice("どうする？ t:拾う n:拾わない > ");
				hero.take(i, board);
			}
			mm.execute();
		}
	}
	
	private GameObject checkGameObject() {
		char ch = board.getMap()[hero.getY()][hero.getX()];
		GameObject gameObject = switch (ch) {
		case 'g' -> goblin;
		case 's' -> slime;
		case 'p' -> potion;
		case 'e' -> ether;
		default -> null;
		};
		return gameObject;
	}
	
	
	private void checkBattleResult(Character c, Monster m) {
		if (m.hp <= 0) {
			board.getMap()[m.getY()][m.getX()] = '.';
			m.setSuffix('.');
		}
		if (c.getHp() <= 0) {
			System.out.println(c.getName() + "は倒れてしまった！");
			System.out.println("GAME OVER");
			System.exit(0);
		}
	}
	
	private void init() {
		this.board = new Board();
		this.monsters = new ArrayList<>();
		this.goblin = new Goblin();
		goblin.setPosition(board);
		monsters.add(goblin);
		this.slime  = new Slime();
		slime.setPosition(board);
		monsters.add(slime);
		
		this.items = new ArrayList<>();
		this.potion = new Potion();
		potion.setPosition(board);
		items.add(potion);
		this.ether = new Ether();
		ether.setPosition(board);
		items.add(ether);
		this.hero = new Hero();
		hero.setPosition(board);
		board.printMap(hero);
		
	}
}
