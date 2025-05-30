package main;

import java.util.Scanner;

public class Rensyu {

	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "アサカ";
		c.selfAid();
		// c.selfAid();
		System.out.println("MP:" + c.mp);
		System.out.println("何秒祈る？");
		int sec = new Scanner(System.in).nextInt();
		int recov = c.pray(sec);
		System.out.println(c.name + "は、" + sec + "秒祈った。");
		System.out.println("MPが" + recov + "回復した");	
		System.out.println("MP:" + c.mp);

	}

}
