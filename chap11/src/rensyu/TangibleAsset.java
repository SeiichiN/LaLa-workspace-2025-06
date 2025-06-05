package rensyu;

public abstract class TangibleAsset extends Asset 
                                  implements Thing {
	String color;
	double weight;
	
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	
	@Override
	public double getWeight() {
		return this.weight;
	}
	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}
} // class end

