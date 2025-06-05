package main;

public class Character {
	int hp;
	String name;
	
	public Character(String name) {
		this.name = name;
		this.hp = 100;
	}
	public Character() {
		this("名無し");
	}
}
