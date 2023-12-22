package s3t3.GardenShop.infrastructure.adapter.repository;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import s3t3.GardenShop.application.port.out.Product;
import s3t3.GardenShop.application.port.out.ProductRepository;

public class TxtProductRepository implements ProductRepository {

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByName(List<Product> gardenProducts, String name) {
		Optional<Product> prod = gardenProducts.stream()
									.filter(p -> p.getName().equalsIgnoreCase(name))
							   		.findFirst();
		return prod.get();
	}

}
