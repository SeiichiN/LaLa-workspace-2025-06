package main;

import java.util.Random;

public class GameObject {
    private int y;
    private int x;
    private String name;
    private char suffix;
    
    public GameObject(String name, char suffix) {
    	this.name = name;
    	this.suffix = suffix;
    }
    
    public void setPosition(Board board) {
    	do {
    		this.y = new Random().nextInt(board.getYsize());
    		this.x = new Random().nextInt(board.getXsize());
    	} while (board.getMap()[y][x] != '.');
    	board.getMap()[y][x] = suffix;
    }
    
    public String toString() {
    	return name;
    }

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getName() {
		return name;
	}

	public char getSuffix() {
		return suffix;
	}

	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}
}
