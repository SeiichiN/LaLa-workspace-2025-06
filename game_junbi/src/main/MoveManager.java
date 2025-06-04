package main;

import java.util.List;

public class MoveManager {
	Hero hero;
	List<Monster> monsters;
	Board board;
	
	public MoveManager(Hero hero, List<Monster> monsters, Board board) {
		this.hero = hero;
		this.monsters = monsters;
		this.board = board;
	}
	
	public void start() {
		while (true) {
			char ch = hero.move(board);
			if (ch == 'q') return;
			for (Monster m : monsters) {
				m.move(board);
			}
			board.printMap();
		}
		
	}
}
