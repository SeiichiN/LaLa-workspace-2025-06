package rensyu;

import main.Hero;

public class Main {

	public static void main(String[] args) {
		Wand wand = new Wand();
		wand.setName("あいう");
		wand.setPower(50);
		Wizard wizard = new Wizard(wand);
		wizard.setName("あさか");
		// wizard.setWand(wand);
		// フィールドwizard.wandは不可視です
		Hero h = new Hero();
		wizard.heal(h);

	}

}
