package test;

import java.util.ArrayList;
import java.util.List;

import main.Ether;
import main.Goblin;
import main.Item;
import main.Monster;
import main.Potion;
import main.Slime;

public class FindClassTest {
	// static List<GameObject> objs;
	static List<Monster> monsters;
	static List<Item> items;

	public static void main(String[] args) {
		setup();
		String findName = "main.Goblin";
		for (Monster m : monsters) {
			String cname = m.getClass().getName();
			if (findName.equals(cname)) {
				System.out.println("find!");
			} else {
				System.out.println("no");
			}
		}
	}
	
	private static void setup() {
		// objs = new ArrayList<>();
		monsters = new ArrayList<>();
		items = new ArrayList<>();
		monsters.add(new Goblin());
		monsters.add(new Slime());
		// objs.add((GameObject) monsters);
		items.add(new Potion());
		items.add(new Ether());
		// objs.add((GameObject) items);
		
	}

}
