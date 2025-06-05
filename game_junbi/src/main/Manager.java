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
		while (true) {
			GameObject gameObject = mm.start();
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
			}
		}
	}
	
	private void checkBattleResult(Character c, Monster m) {
		if (m.hp <= 0) {
			board.map[m.y][m.x] = '.';
			if (m instanceof Slime) slime = null;
			if (m instanceof Goblin) goblin = null;
		}
		if (c.hp <= 0) {
			System.out.println(c.name + "は倒れてしまった！");
			System.out.println("GAME OVER");
			System.exit(0);
		}
	}
	
	private void init() {
		board = new Board();
		monsters = new ArrayList<>();
		goblin = new Goblin();
		goblin.setPosition(board);
		monsters.add(goblin);
		slime  = new Slime();
		slime.setPosition(board);
		monsters.add(slime);
		
		items = new ArrayList<>();
		potion = new Potion();
		potion.setPosition(board);
		items.add(potion);
		ether = new Ether();
		ether.setPosition(board);
		items.add(ether);
		hero = new Hero();
		hero.setPosition(board);
		board.printMap(hero);
		
	}
}
