package main;

import java.util.Scanner;

public class Util {
	public char lower(char c) {
		if (c < 'a') {
			 return (char)(c + ' ');
		}
		return c;
	}
	
	public static char choice(String msg) {
		System.out.print(msg);
		@SuppressWarnings("resource")
		char ch = new Scanner(System.in).next().charAt(0);
		return ch;
	}
}
