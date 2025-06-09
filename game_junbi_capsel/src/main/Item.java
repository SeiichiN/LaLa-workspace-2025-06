package main;

public abstract class Item extends GameObject {

	public Item(String name, char suffix) {
		super(name, suffix);
	}
	
	public String toString() {
		return this.getName();
	}
}
