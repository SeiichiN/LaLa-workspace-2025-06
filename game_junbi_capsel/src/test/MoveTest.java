package test;

import main.Board;
import main.Goblin;
import main.Hero;

public class MoveTest {

	public static void main(String[] args) {
		Board board = new Board();
		Goblin g = new Goblin();
		g.setPosition(board);
		Hero h = new Hero();
		h.setPosition(board);
		h.move(board);
		g.move(board);
	}

}
