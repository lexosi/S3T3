package s3t3.GardenShop.domain;

import s3t3.GardenShop.domain.enums.ProductType;

public class Decorations extends Product {
	
	private boolean material;
	
	public Decorations(ProductType prodType, double price, String name, boolean material) {
		super(prodType, price, name);
		this.material = material;
	}
	
	public boolean getMaterial() {
		return material;
	}
	
	public void setMaterial(boolean material) {
		this.material = material;
	}

}
