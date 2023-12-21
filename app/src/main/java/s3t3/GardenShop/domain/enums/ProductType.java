package s3t3.GardenShop.domain.enums;

public enum ProductType {
    
	TREE("T"),
	FLOWER("F"),
	DECORATION("D");
	
	private final String productType;
	
	ProductType(String productType){
		this.productType = productType;
	}
	
	public String getProductType() {
		return this.productType;
	}
	
	public String toString() {
		return this.productType.toLowerCase();
	}
}
