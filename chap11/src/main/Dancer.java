package main;

public class Dancer extends Character {

	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "は" + m.suffix + "を攻撃した");
		m.hp -= 3;
		System.out.println("3ポイントのダメージを与えた");
	}

}
