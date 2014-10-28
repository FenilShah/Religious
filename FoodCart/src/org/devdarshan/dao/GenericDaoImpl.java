package org.devdarshan.dao;


import java.io.Serializable;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.hibernate4.support.HibernateDaoSupport;


import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class GenericDaoImpl<T> implements GenericDao<T> {
	
	/*public GenericDaoImpl(){
		//Do Also Nothing here ha ha ha
	}
	//@Autowired
	public GenericDaoImpl(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}*/
	/*@Autowired
	protected void init(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}*/
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	public Session getSession() {
	    return sessionFactory.getCurrentSession();
	}
	
	//@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		//getHibernateTemplate().save(t);
		//Session session = this.sessionFactory.openSession();
		//this.sessionFactory.getCurrentSession().save(t);
		//session.save(t);
		//session.close();
		getSession().save(t);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		//getHibernateTemplate().update(t);
		getSession().update(t);
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		//getHibernateTemplate().delete(t);
		getSession().delete(t);
	}
	
	@Override
	public Criteria findByCriteria(T t){
		return getSession().createCriteria(t.getClass());
	}

	@Override
	public Object findById(T t,Integer id) {
		// TODO Auto-generated method stub
		return getSession().load(t.getClass(), id);
	}

}
