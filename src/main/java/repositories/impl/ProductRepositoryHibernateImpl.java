package repositories.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import model.Product;
import repositories.ProductRepository;

public class ProductRepositoryHibernateImpl extends BaseRepositoryHibernateImpl<Product, Integer> implements ProductRepository {

	@Transactional
	public List<Product> getProducts() throws Exception {
		final Session session = sessionFactory.getCurrentSession();
		String hql = "select * from Product";
		final Query query = session.createQuery(hql);
	    List<Product> list = (List<Product>) query.list();
	    return list;
	}

	@Override
	public List<Product> getAllProducts() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
