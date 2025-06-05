package rensyu;

public class Main2 {

	public static void main(String[] args) {
		Y[] ys = new Y[2];
		ys[0] = new A();
		ys[1] = new B();
		for (Y y : ys) {
			y.b();
		}

	}

}
