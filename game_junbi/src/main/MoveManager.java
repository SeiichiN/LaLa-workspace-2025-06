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
		for (Monster m : monsters) {
			if (m.y == hero.y && m.x == hero.x) {
				gameObject = m;
			}
		}
		for (Item i : items) {
			if (i.y == hero.y && i.x == hero.x) {
				gameObject = i;
			}
		}
		return gameObject;
	}
}
