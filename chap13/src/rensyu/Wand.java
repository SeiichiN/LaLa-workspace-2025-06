package rensyu;

public class Wand {
	private String name;
	private double power;
	
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
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if (power >= 0.5 && power <= 100) {
			this.power = power;
		} else {
			throw new IllegalArgumentException
			  ("増幅率の値が不正です");
		}
	}
}
