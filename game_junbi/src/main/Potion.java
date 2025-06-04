package main;

public class Potion extends Item {
	int recovHp;

	public Potion(String name, char suffix) {
		super(name, suffix);
		recovHp = 100;
	}

}
