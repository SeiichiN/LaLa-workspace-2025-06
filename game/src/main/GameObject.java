package main;

import java.util.Random;

public class GameObject {
    int y;
    int x;
    String name;
    
    public void setPosition(Board board) {
    	do {
    		int y = new Random().nextInt(board.ysize);
    		int x = new Random().nextInt(board.xsize);
    	} while (board.map[y][x] != '.');
    }
}
