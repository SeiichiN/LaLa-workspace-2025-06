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
		System.out.println(damage + "ポイントのダメージを与えた！");
	}
	
}
