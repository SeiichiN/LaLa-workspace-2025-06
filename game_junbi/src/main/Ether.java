package main;

public class Ether extends Item {
	int recovMp;

	public Ether(String name, char suffix) {
		super(name, suffix);
		recovMp = 50;
	}
	public Ether() {
		this("エーテル", 'e');
	}

}
