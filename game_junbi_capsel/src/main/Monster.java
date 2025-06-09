package main;

import java.util.Random;

public abstract class Monster extends GameObject implements IAttackCharacter {
	int hp;

	public Monster(String name, char suffix) {
		super(name, suffix);
		this.hp = 100;
	}
	
	public void attack(Character c) {
		System.out.println(this.getName() + "は" + c.getName() + "を攻撃した！");
		int damage = new Random().nextInt(IAttackCharacter.attackP + 1);
		if (damage == 0) {
			System.out.println(this.getName() + "の攻撃は失敗した！");
		} else {
			c.setHp(c.getHp() - damage);
			System.out.println(c.getName() + "は" + damage + "ポイントのダメージを受けた！");
		}
	}
	
	/**
	 *    1
	 *  4 0 2
	 *    3
	 */
	public void move(Board board) {
		int old_y = this.getY();
		int old_x = this.getX();
		int dir = new Random().nextInt(5);
	   	switch (dir) {
    	case 1 -> {
    		this.setY(Math.max(this.getY() - 1, 0));
    	}
    	case 3 -> {
    		this.setY(Math.min(this.getY() + 1, board.getYsize() - 1));
    	}
    	case 4 -> {
    		this.setX(Math.max(this.getX() - 1, 0));
    	}
    	case 2 -> {
    		this.setX(Math.min(this.getX() + 1, board.getXsize() - 1));
    	}
    	default -> {
    		
    	}
    	}
	   	if (board.getMap()[this.getY()][this.getX()] == '.') {
		   	board.getMap()[old_y][old_x] = '.';
		   	board.getMap()[this.getY()][this.getX()] = this.getSuffix();
	   	} else {
	   		this.setY(old_y);
	   		this.setX(old_x);
	   	}
	}
	
	public String toString() {
		return this.getName();
	}
}
