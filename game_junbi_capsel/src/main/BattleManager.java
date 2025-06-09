package main;

import java.util.Scanner;

public class BattleManager {
	public void fight(Character c, Monster m) {
		while (c.getHp() > 0 && m.hp > 0) {
			System.out.print(c.getName() + " HP:" + c.getHp() + " ");
			System.out.println(m.getName() + " HP:" + m.hp );
			System.out.print("A:戦う Q:逃げる > ");
			@SuppressWarnings("resource")
			char select = new Scanner(System.in).next().charAt(0);
			if (select == 'q') {
				System.out.println(c.getName() + "は逃げ出した！");
				return;
			}
			c.attack(m);
			if (m.hp <= 0) break;
			m.attack(c);
		}
		if (c.getHp() > 0) {
			System.out.println(c.getName() + "は" + m.getName() + "を倒した！");
		} else {
			System.out.println(c.getName() + "は倒れた！");
		}
	}
}
