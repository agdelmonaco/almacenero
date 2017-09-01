package repositories;

import repositories.impl.ProductRepositoryHibernateImpl;

public class RepositoryLocator {
private static final RepositoryLocator instance = new RepositoryLocator();
	
	private ProductRepositoryHibernateImpl passengerRepository;
		
	public static RepositoryLocator getInstance() {
        return instance;
    }

	public ProductRepositoryHibernateImpl getPassengerRepository() {
		return passengerRepository;
	}

	public void setPassengerRepository(ProductRepositoryHibernateImpl passengerRepository) {
		this.passengerRepository = passengerRepository;
	}
	

}
