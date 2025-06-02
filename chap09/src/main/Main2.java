package main;

public class Main2 {

	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		Hero h2 = new Hero("アサカ");
		Hero h3 = new Hero();
		Wizard w = new Wizard();
		w.name = "スズキ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h3);

	}

}
