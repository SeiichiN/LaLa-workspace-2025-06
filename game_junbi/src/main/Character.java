package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Character implements IAttackMonster {
    int y;
    int x;
    String name;
    char suffix;
    int hp;
    int mp;
    List<Item> items;
    
    public Character(String name, char suffix) {
    	this.name = name;
    	this.suffix = suffix;
    	this.hp = 100;
    	this.mp = 50;
    	items = new ArrayList<>();
    }
    
    public void setPosition(Board board) {
    	this.y = new Random().nextInt(board.ysize);
    	this.x = new Random().nextInt(board.xsize);
    }
    
    public void attack(Monster m) {
		System.out.println();
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
    	char dir = Util.choice("A:← W:↑ S:↓ D:→ Q:その他 > ");
    	if (dir < 'a') dir = (char)(dir + ' ');
    	if (dir == 'q') return 'q';
    	switch (dir) {
    	case 'w' -> {
    		y = Math.max(y-1, 0);
    	}
    	case 's' -> {
    		y = Math.min(y+1, board.ysize - 1);
    	}
    	case 'a' -> {
    		x = Math.max(x-1, 0);
    	}
    	case 'd' -> {
    		x = Math.min(x+1, board.xsize - 1);
    	}
    	}
    	return 'm';
    }
    
    public void take(Item i, Board board) {
    	items.add(i);
    	board.map[i.y][i.x] = '.';
    	System.out.println(i.name + "を装備した");
    }
    
    public void info() {
    	System.out.print("HP:" + this.hp + " MP:" + this.mp);
    	System.out.print(" 装備:");
    	for (Item i : items) {
    		System.out.print(" " + i);
    	}
    	System.out.println();
    }
    
    public void useItem() {
    	for (int i = 0; i < items.size(); i++) {
    		System.out.print(" " + i + ":" + items.get(i));
    	}
    	char ch = Util.choice("どれを使う？ > ");
    	int n = ch - '0';
    	System.out.println(this.name + "は" + items.get(n) + "を使った");
    	switch (n) {
    	case 0 -> {
    		if (items.get(n) instanceof Potion p) {
        		this.hp = p.recovHp;
        		p.recovHp = 0;
    		}
    	}
    	case 1 -> {
    		if (items.get(n) instanceof Ether e) {
    			this.mp = e.recovMp;
    			e.recovMp = 0;
    		}
    	}
    	}
    	items.remove(n);
    }
}
