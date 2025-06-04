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
		GameObject gameObject = mm.start();
		if (gameObject instanceof Monster) {
			Monster m = (Monster)gameObject;
			System.out.println(m + "が現れた！");
			BattleManager battleManager = new BattleManager();
			battleManager.fight(hero, m);
		}
		if (gameObject instanceof Item) {
			Item i = (Item)gameObject;
			System.out.println(i + "が落ちている！");
		}
		// goblin.attack(hero);
		// slime.attack(hero);
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
