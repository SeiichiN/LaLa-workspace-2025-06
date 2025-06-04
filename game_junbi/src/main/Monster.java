package main;

import java.util.Random;

public abstract class Monster extends GameObject implements IAttackCharacter {
	int hp;

	public Monster(String name, char suffix) {
		super(name, suffix);
		this.hp = 100;
	}
	
	public void attack(Character c) {
		System.out.println(this.name + "は" + c.name + "を攻撃した！");
		int damage = new Random().nextInt(IAttackCharacter.attackP + 1);
		if (damage == 0) {
			System.out.println(this.name + "の攻撃は失敗した！");
		} else {
			c.hp -= damage;
			System.out.println(c.name + "は" + damage + "ポイントのダメージを受けた！");
		}
	}
	
	/**
	 *    1
	 *  4 0 2
	 *    3
	 */
	public void move(Board board) {
		int _y = y;
		int _x = x;
		int dir = new Random().nextInt(5);
	   	switch (dir) {
    	case 1 -> {
    		y -= 1;
    		if (y < 0) y = 0;
    	}
    	case 3 -> {
    		y += 1;
    		if (y >= board.ysize) y = board.ysize - 1;
    	}
    	case 4 -> {
    		x -= 1;
    		if (x < 0) x = 0;
    	}
    	case 2 -> {
    		x += 1;
    		if (x >= board.xsize) x = board.xsize - 1;
    	}
    	default -> {
    		
    	}
    	}
	   	board.map[_y][_x] = '.';
	   	board.map[y][x] = this.suffix;
	}
	
	public String toString() {
		return this.name;
	}
}
