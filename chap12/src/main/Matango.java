package main;

public class Matango extends Monster {
	int hp = 50;
	char suffix;
	
	public Matango() {
		this('A');
	}
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	/*
	public void attack(Hero h) {
		System.out.println("きのこ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
	*/
	@Override
	public void run() {
		System.out.println(this.suffix + "は逃げた");
	}
}
