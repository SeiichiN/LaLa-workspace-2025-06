package main;

public class Main {

	public static void main(String[] args) {
		Matango m = new Matango();
		Hero h = new Hero();
		h.attack(m);
		m.run();
		h.run();
		h.slip();
		SuperHero sh = new SuperHero();
		sh.fly();
		sh.land();
		sh.attack(m);
		sh.run();
		sh.slip();
	}

}
