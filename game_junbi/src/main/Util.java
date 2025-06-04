package main;

public class Util {
	public char lower(char c) {
		if (c < 'a') {
			 return (char)(c + ' ');
		}
		return c;
	}
}
