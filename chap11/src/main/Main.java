package main;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		Matango m = new Matango('A');
		h.attack(m);
		Dancer d = new Dancer();
		d.name = "ダンサー";
		d.attack(m);

	}

}
