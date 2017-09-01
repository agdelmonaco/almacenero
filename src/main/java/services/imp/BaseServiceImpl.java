package services.imp;

import java.io.Serializable;
import java.util.List;

import dto.DTOFactory;
import repositories.impl.BaseRepositoryHibernateImpl;
import services.BaseService;

public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {
	
	private BaseRepositoryHibernateImpl baseRepository;
	
	private DTOFactory dtoFactory;
	
	public BaseRepositoryHibernateImpl getBaseRepository(){
		return baseRepository;
	}
	
	public void setBaseRepository(BaseRepositoryHibernateImpl baseRepository){
		this.baseRepository = baseRepository;
	}
	
	public DTOFactory getDtoFactory(){
		return dtoFactory;
	}
	
	public void setDtoFactory(DTOFactory dtoFactory){
		this.dtoFactory = dtoFactory;
	}
	
	@Override
	public T save(T entity) throws Exception {
		T savedEntity = (T) baseRepository.save(entity);
		return savedEntity;
	}

	@Override
	public void saveOrUpdate(T entity) throws Exception {
		baseRepository.saveOrUpdate(entity);		
	}

	@Override
	public T get(Class<T> type, ID id) throws Exception {
		T entity = (T) baseRepository.get(type, id);
		return entity;
	}

	@Override
	public void delete(T entity) throws Exception {
		baseRepository.delete(entity);		
	}

	@Override
	public List<T> findAll(Class<T> type) throws Exception {
		List<T> entities = baseRepository.findAll(type);
		return entities;
	}

}
