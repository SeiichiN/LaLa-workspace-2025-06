package main;

public class Ether extends Item {
	private int recovMp;

	public Ether(String name, char suffix) {
		super(name, suffix);
		recovMp = 50;
	}
	public Ether() {
		this("エーテル", 'e');
	}
	public int getRecovMp() {
		return recovMp;
	}
	public void setRecovMp(int recovMp) {
		this.recovMp = recovMp;
	}

}
