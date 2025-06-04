package test;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		System.out.print("input char > ");
		@SuppressWarnings("resource")
		char dir = new Scanner(System.in).next().charAt(0);
		if (dir < 'a') dir = (char) (dir + ' ');
		System.out.println(dir);
	}

}
