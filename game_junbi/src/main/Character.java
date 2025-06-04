package main;

import java.util.Random;

public abstract class Character implements IAttackMonster {
    int y;
    int x;
    String name;
    char suffix;
    int hp;
    
    public Character(String name, char suffix) {
    	this.name = name;
    	this.suffix = suffix;
    }
    
    public void setPosition(Board board) {
    	this.y = new Random().nextInt(board.ysize);
    	this.x = new Random().nextInt(board.xsize);
    	board.map[y][x] = suffix;
    }
    
    public void attack(Monster m) {
    	System.out.println(this.name + "による攻撃！");
    	int damage = new Random().nextInt(IAttackMonster.attackP + 1);
    	m.hp -= damage;
    	System.out.println(m.name + "に" + damage + "ポイントのダメージを与えた！");
    }
}
