package main;

public class Main {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero("ミナト");  // Heroインスタンス
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		h.attack();
	}

}
