package rensyu;

import main.Hero;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard(Wand wand) {
		this.setWand(wand);
	}
	
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		// フィールド wand.powerは不可視です
		h.setHp(h.getHp() + recovPoint);
		System.out.println
		  (h.getName() + "のHPを" + recovPoint + "回復した");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0) { hp = 0; }
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException
			  ("mpは必ず0以上です");
		}
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			  ("名前がnullです");
		}
		if (name.length() < 3) {
			throw new IllegalArgumentException
			  ("名前は3文字以上必要です");
		}		
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException
			  ("wandがnullです");
		}
		this.wand = wand;
	}
}
