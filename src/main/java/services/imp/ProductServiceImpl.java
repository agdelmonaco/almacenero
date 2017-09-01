package services.imp;

import java.util.List;
import model.Product;
import repositories.impl.ProductRepositoryHibernateImpl;
import services.ProductService;

public class ProductServiceImpl extends BaseServiceImpl<Product, Integer> implements ProductService {

	private ProductRepositoryHibernateImpl productRepository;
	
	public ProductRepositoryHibernateImpl getReviewRepository(){
		return productRepository;
	}
	
	public void setReviewRepository(ProductRepositoryHibernateImpl reviewRepository){
		this.productRepository = reviewRepository;
	}
	
	@Override
	public List<Product> getProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
