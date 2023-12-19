package s3t3.GardenShop.domain;

public class Tree extends Product {
	
	private double height;
	
	public Tree(double price, String name, double height) {
		super(price, name);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

}
