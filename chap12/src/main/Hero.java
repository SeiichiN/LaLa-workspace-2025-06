package main;

public class Hero extends Character {
	@Override
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に10ポイントのダメージを与えた");
		m.hp -= 10;
	}
}
