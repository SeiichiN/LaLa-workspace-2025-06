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
	
	public GameObject start() {
		GameObject gameObject = null;
		while (true) {
			char ch = hero.move(board);
			if (ch == 'q') break;
			for (Monster m : monsters) {
				m.move(board);
			}
			board.printMap(hero);
			// heroの場所にgameObjectがあるかどうか
			gameObject = checkGameObject();
			if (gameObject != null) {
				break;
			}
		}
		System.out.println("move終了");
		return gameObject;
	}
	
	private GameObject checkGameObject() {
		GameObject gameObject = null;
		if (board.map[hero.y][hero.x] == 'g') {
			for (Monster m : monsters) {
				if (m instanceof Goblin) {
					gameObject = m;
				}
			}
		}
		if (board.map[hero.y][hero.x] == 's') {
			for (Monster m : monsters) {
				if (m instanceof Slime) {
					gameObject = m;
				}
			}
		}
		if (board.map[hero.y][hero.x] == 'p') {
			
		}
		for (Item i : items) {
			if (i.y == hero.y && i.x == hero.x) {
				gameObject = i;
			}
		}
		return gameObject;
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
