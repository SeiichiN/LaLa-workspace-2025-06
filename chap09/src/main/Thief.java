package main;

public class Thief {
	static {
		System.out.println("static初期化");
	}
	{
		System.out.println("初期化");
	}
	String name;
	int hp;
	int mp;
	
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}
	public Thief(String name) {
		this(name, 40, 5);
	}
	
}
