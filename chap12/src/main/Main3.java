package main;

public class Main3 {

	public static void main(String[] args) {
		Character c = new Wizard();
		Matango m = new Matango();
		// Wizardにもどす
		if (c instanceof Wizard w) {
			w.fireball(m);
		}
		if (c instanceof Hero h) {
			h.attack(m);
		}
		
	}

}
