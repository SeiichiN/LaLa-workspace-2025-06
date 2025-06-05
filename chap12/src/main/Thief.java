package main;

public class Thief extends Character {

	@Override
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 3;
		System.out.println("3ポイントのダメージ");
	}

}
