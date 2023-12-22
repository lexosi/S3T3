package s3t3.GardenShop.application.service;

import s3t3.GardenShop.application.port.in.RemoveProduct;
import s3t3.GardenShop.domain.enums.ProductType;
import s3t3.GardenShop.infrastructure.adapter.repository.TxtGardenShopRepository;

public class RemoveProductService implements RemoveProduct {

	private final TxtGardenShopRepository repository;
	
	public RemoveProductService(TxtGardenShopRepository repository) {
		this.repository = repository;
	}

	@Override
	public void removeProduct(ProductType prodType) {
		
		repository.delete(product);
		
	}
}
