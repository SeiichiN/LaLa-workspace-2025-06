package rensyu;

import main.Hero;

public class PoisonMatango extends Matango {
	int attackCount;

	public PoisonMatango(char suffix) {
		super(suffix);
		attackCount = 5;
	}
	
	@Override
	public void attack(Hero h) {
		System.out.println("------ 攻撃開始 ----------");
		super.attack(h);
		if (this.attackCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ");
			this.attackCount--;
		}
	}

}
