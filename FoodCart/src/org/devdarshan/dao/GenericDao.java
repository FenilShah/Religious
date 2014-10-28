package org.devdarshan.dao;

import org.hibernate.Criteria;

public interface GenericDao<T> {
	public void save(T t);
	public void update(T t);
	public void delete(T t);
	public Criteria findByCriteria(T t);
	public Object findById(T t,Integer id);
}
