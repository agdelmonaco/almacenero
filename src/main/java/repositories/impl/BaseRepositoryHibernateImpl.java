package repositories.impl;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import repositories.BaseRepository;

public class BaseRepositoryHibernateImpl<T, ID extends Serializable> implements BaseRepository<T, ID> {

protected SessionFactory sessionFactory;

public SessionFactory getSessionFactory(){
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory){
	this.sessionFactory = sessionFactory;
}
	
	@Transactional
	public T save(T entity) throws Exception {
		final Session session = sessionFactory.getCurrentSession();
		T entitySaved = (T)session.save(entity);
		return entitySaved; 
	}

	@Transactional
	public void saveOrUpdate(T entity) throws Exception {
		final Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);		
	}

	@Transactional
	public T get(Class<T> type,ID id) throws Exception {
		final Session session = sessionFactory.getCurrentSession();
		T entity = (T)session.get(type, id);
		return entity;
	}

	@Transactional
	public void delete(T entity) throws Exception {
		final Session session = sessionFactory.getCurrentSession();
		session.delete(entity);		
	}
	
	@Transactional
	public List<T> findAll(Class<T> type) throws Exception {
		final Session session = sessionFactory.getCurrentSession();
		String hql = "from " + type.getName().substring(type.getName().lastIndexOf('.') + 1);
	    final Query query = session.createQuery(hql);
	    List<T> list = query.list();
	    return list;
	}


}
