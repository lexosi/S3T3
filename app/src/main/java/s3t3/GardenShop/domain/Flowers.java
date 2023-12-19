package s3t3.GardenShop.domain;

public class Flowers extends Product {
	
	private Colours colour;
	
	public Flowers(double price, String name, Colours colour) {
		super(price, name);
		this.colour = colour;
	}
	
	public Colours getColour() {
		return colour;
	}
	
	public void setColour(Colours colour) {
		this.colour = colour;
	}

}
