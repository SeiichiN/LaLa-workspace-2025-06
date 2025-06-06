package main;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		String name = null;
		h.setName(name);
		Inn inn = new Inn();
		King king = new King();
		inn.checkIn(h);
		System.out.println(h.getHp());
		king.talk(h);

	}

}
