package repositories;

import java.util.List;

import model.Product;

public interface ProductRepository  {
	List<Product> getAllProducts() throws Exception;
}
