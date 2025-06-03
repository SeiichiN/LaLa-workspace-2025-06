package main;

public class Hero {
	String name;
	public int hp = 100;

	public Hero() {
		this("名無し");
	}
	public Hero(String name) {
		this.name = name;
		// System.out.println("Heroコンストラクタ");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 10;
		System.out.println("10ポイントのダメージを与えた");
	}
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はころんだ！");
		System.out.println("5のダメージ");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
}
