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
		MoveManager mm = new MoveManager(hero, monsters, board);
		mm.start();
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
		board.printMap();
		
	}
}
