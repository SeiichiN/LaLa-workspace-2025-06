package main;

public class Manager {
	public void start() {
		Board board = new Board();
		board.makeMap();
		GameObject gobj = new GameObject("ゴブリン", 'g');
		gobj.setPosition(board);
		board.printMap();
		
	}
}
