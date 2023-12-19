package s3t3.GardenShop.domain;

public class Decorations extends Product {
	
	private boolean material;
	
	public Decorations(double price, String name, boolean material) {
		super(price, name);
		this.material = material;
	}
	
	public boolean getMaterial() {
		return material;
	}
	
	public void setMaterial(boolean material) {
		this.material = material;
	}

}
