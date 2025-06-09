package main;

import java.util.Random;

public class Slime extends Monster {

	public Slime(String name, char suffix) {
		super(name, suffix);
	}
	public Slime() {
		this("スライム", 's');
	}
	
	public void attack(Character c) {
		System.out.println(this.getName() + "は毒をばらまいた！");
		int damage = new Random().nextInt(IAttackCharacter.attackP - 10) + 10;
		c.setHp(c.getHp() - damage);
		System.out.println(c.getName() + "に" + damage + "ポイントのダメージを与えた！");
	}

}
