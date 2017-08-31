package services;

public class ServiceLocator {

	private static final ServiceLocator instance = new ServiceLocator();

	private ProductService producService;
	
	public static ServiceLocator getInstance() {
        return instance;
    }

	public ProductService getProducService() {
		return producService;
	}

	public void setProducService(ProductService producService) {
		this.producService = producService;
	}
	
}
