package main;

import java.util.Random;

public class GameObject {
    int y;
    int x;
    String name;
    char suffix;
    
    public GameObject(String name, char suffix) {
    	this.name = name;
    	this.suffix = suffix;
    }
    
    public void setPosition(Board board) {
    	do {
    		this.y = new Random().nextInt(board.ysize);
    		this.x = new Random().nextInt(board.xsize);
    	} while (board.map[y][x] != '.');
    	board.map[y][x] = suffix;
    }
    
    public String toString() {
    	return name;
    }
}
