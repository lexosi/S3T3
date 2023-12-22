package s3t3.GardenShop.domain;

import s3t3.GardenShop.domain.enums.ProductType;

public class Decoration extends Product {

    private boolean material;

    public Decoration(ProductType prodType, double price, String name, boolean material) {
        super(prodType, price, name);
        this.material = material;
    }

    public boolean getMaterial() {
        return material;
    }

    public void setMaterial(boolean material) {
        this.material = material;
    }

    public String materialToString() {
        if(material == true) {
            return "plastic";
        } else {
            return "wood";
        }
    }

    @Override
    public String toString() {
        return (super.toString() +
                "\nMaterial: " + materialToString());
    }

}
