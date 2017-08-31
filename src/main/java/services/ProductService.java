package services;

import java.util.List;

import model.Product;

public interface ProductService extends BaseService<Product, Integer> {

	List<Product> getProduct(Product product) throws Exception;
	void saveProduct(Product product) throws Exception;
	
}
