package rensyu;

public class Main {

	public static void main(String[] args) {
		X obj = new A();
		obj.a();

		Y y1 = new A();
		Y y2 = new B();
		y1.a();  // Aa
		y2.a();  // Ba
	}

}
