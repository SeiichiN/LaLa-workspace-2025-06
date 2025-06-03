package main;

public class Manager {
	public void start() {
		Board board = new Board();
		board.makeMap();
		GameObject goblin = new GameObject("ゴブリン", 'g');
		goblin.setPosition(board);
		board.printMap();
		
	}
}
