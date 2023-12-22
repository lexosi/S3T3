package s3t3.GardenShop.application.port.out;

public interface ProductRepository {

	Product save(Product product);
	Product findById(List<Product> gardenStock, int prodID);

}
