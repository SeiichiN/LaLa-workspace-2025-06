package main;

public class Matango {
	private int hp = 50;
	private char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("きのこ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}
	public int getHp() {
		return hp;
	}
	public char getSuffix() {
		return suffix;
	}
}
