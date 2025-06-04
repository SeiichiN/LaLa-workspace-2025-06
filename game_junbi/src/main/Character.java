package main;

import java.util.Random;
import java.util.Scanner;

public abstract class Character implements IAttackMonster {
    int y;
    int x;
    String name;
    char suffix;
    int hp;
    
    public Character(String name, char suffix) {
    	this.name = name;
    	this.suffix = suffix;
    	this.hp = 100;
    }
    
    public void setPosition(Board board) {
    	this.y = new Random().nextInt(board.ysize);
    	this.x = new Random().nextInt(board.xsize);
    	board.map[y][x] = suffix;
    }
    
    public void attack(Monster m) {
    	System.out.println(this.name + "による攻撃！");
    	int damage = new Random().nextInt(IAttackMonster.attackP + 1);
    	if (damage == 0) {
    		System.out.println(this.name + "の攻撃は失敗した！");
    	} else {
        	m.hp -= damage;
        	System.out.println(m.name + "に" + damage + "ポイントのダメージを与えた！");
    	}
    }
    
    public char move(Board board) {
    	System.out.print("A:← W:↑ S:↓ D:→ Q:戻る > ");
    	@SuppressWarnings("resource")
		char dir = new Scanner(System.in).next().charAt(0);
    	if (dir < 'a') dir = (char)(dir + ' ');
    	if (dir == 'q') return 'q';
    	switch (dir) {
    	case 'w' -> {
    		y -= 1;
    		if (y < 0) y = 0;
    	}
    	case 's' -> {
    		y += 1;
    		if (y >= board.ysize) y = board.ysize - 1;
    	}
    	case 'a' -> {
    		x -= 1;
    		if (x < 0) x = 0;
    	}
    	case 'd' -> {
    		x += 1;
    		if (x >= board.xsize) x = board.xsize - 1;
    	}
    	}
    	return 'm';
    }
}
