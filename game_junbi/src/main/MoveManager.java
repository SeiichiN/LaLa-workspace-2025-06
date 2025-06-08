package main;

import java.util.List;

public class MoveManager {
	Hero hero;
	List<Monster> monsters;
	List<Item> items;
	Board board;
	
	public MoveManager(Hero hero, List<Monster> monsters, List<Item> items, Board board) {
		this.hero = hero;
		this.monsters = monsters;
		this.items = items;
		this.board = board;
	}
	
	public void execute() {
		char ch = hero.move(board);
		for (Monster m : monsters) {
			m.move(board);
		}
		if (ch == 'q') {
			ch = Util.choice("i:状態 t:使う > ");
			switch (ch) {
			case 'i' -> {
				hero.info();
			}
			case 't' -> {
				hero.useItem();
			}
			}
		}
		board.printMap(hero);
	}
	
	
	private GameObject findClass(String className) {
		/*
		Class<?> cname;
		try {
			cname = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Item i : items) {
			if (i instanceof cname) {
				return i;
			}
		}*/
		return null;
	}
	
}
