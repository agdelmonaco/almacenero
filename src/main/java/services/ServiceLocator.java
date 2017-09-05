package services;

public class ServiceLocator {

	private static final ServiceLocator instance = new ServiceLocator();

	private ProductService productService;
	
	public static ServiceLocator getInstance() {
        return instance;
    }


	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
}
