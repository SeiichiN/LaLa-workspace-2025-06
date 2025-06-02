package main;

public class Wizard {
	String name;
	int hp;
	
	public Wizard() {
		this("スガワラ");
	}
	public Wizard(String name) {
		this.name = name;
		this.hp = 50;
	}
	
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}
}
