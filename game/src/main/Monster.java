package main;

import java.util.Random;

public abstract class Monster extends GameObject {
	int attackP;

	public Monster(String name, char suffix) {
		super(name, suffix);
		attackP = 30;
	}
	
	public void attack(Character c) {
		System.out.println(this.name + "の攻撃！");
		int damage = new Random().nextInt(attackP);
		c.hp -= damage;
		System.out.print(c.name + "に");
		System.out.println(damage + "ポイントのダメージを与えた！");
	}
}
