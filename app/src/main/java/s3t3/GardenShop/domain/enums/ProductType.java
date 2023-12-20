package s3t3.GardenShop.domain.enums;

public enum ProductType {
    
	T("Tree"),
	F("Flower"),
	D("Decoration");
	
	private final String productType;
	
	ProductType(String productType){
		this.productType = productType;
	}
	
	public String getProductType() {
		return this.productType;
	}
}
