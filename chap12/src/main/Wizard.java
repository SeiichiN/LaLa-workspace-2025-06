package main;

public class Wizard extends Character {
	int mp;
	
	@Override
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に３ポイントのダメージ");
		m.hp -= 3;
	}
	public void fireball(Monster m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 10;
		this.mp -= 5;
	}

}
