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
		int old_y = y;
		int old_x = x;
		int dir = new Random().nextInt(5);
	   	switch (dir) {
    	case 1 -> {
    		y = Math.max(y - 1, 0);
    	}
    	case 3 -> {
    		y = Math.min(y + 1, board.ysize - 1);
    	}
    	case 4 -> {
    		x = Math.max(x - 1, 0);
    	}
    	case 2 -> {
    		x = Math.min(x + 1, board.xsize - 1);
    	}
    	default -> {
    		
    	}
    	}
	   	if (board.map[y][x] == '.') {
		   	board.map[old_y][old_x] = '.';
		   	board.map[y][x] = this.suffix;
	   	} else {
	   		y = old_y;
	   		x = old_x;
	   	}
	}
	
	public String toString() {
		return this.name;
	}
}
