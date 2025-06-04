package main;

import java.util.Random;

public class Slime extends Monster {

	public Slime(String name, char suffix) {
		super(name, suffix);
	}
	public void attack(Character c) {
		System.out.println(this.name + "は毒をばらまいた！");
		int damage = new Random().nextInt(IAttackCharacter.attackP - 10) + 10;
		System.out.println(this.name + "に" + damage + "ポイントのダメージを与えた！");
	}

}
