package s3t3.GardenShop.domain;

import s3t3.GardenShop.domain.enums.Colours;
import s3t3.GardenShop.domain.enums.ProductType;

public class Flowers extends Product {
	
	private Colours colour;
	
	public Flowers(ProductType prodType, double price, String name, Colours colour) {
		super(prodType, price, name);
		this.colour = colour;
	}
	
	public Colours getColour() {
		return colour;
	}
	
	public void setColour(Colours colour) {
		this.colour = colour;
	}

}
