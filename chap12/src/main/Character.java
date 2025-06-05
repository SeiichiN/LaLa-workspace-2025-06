package main;

public abstract class Character {
	String name;
	int hp;
	
	public Character() {
		this.name = "名無し";
		this.hp = 100;
	}
	
	public void run() { 
		System.out.println(this.name + "は逃げ出した！");
	}
	public abstract void attack(Monster m);
	
	public String toString() {
		return name + ":" + hp;
	}

}
