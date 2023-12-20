package s3t3.GardenShop.application.port.in;

import s3t3.GardenShop.domain.enums.ProductType;

public interface RemoveProduct {

	void removeProduct(ProductType prodType);
}
