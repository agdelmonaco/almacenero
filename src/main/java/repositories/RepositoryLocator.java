package repositories;

import repositories.impl.ProductRepositoryHibernateImpl;

public class RepositoryLocator {
private static final RepositoryLocator instance = new RepositoryLocator();
	
	private ProductRepositoryHibernateImpl productRepository;
		
	public static RepositoryLocator getInstance() {
        return instance;
    }

	public ProductRepositoryHibernateImpl getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepositoryHibernateImpl productRepository) {
		this.productRepository = productRepository;
	}


	

}
