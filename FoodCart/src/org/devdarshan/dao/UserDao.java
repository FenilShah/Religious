package org.devdarshan.dao;



import javax.inject.Inject;

import org.devdarshan.beans.User;
import org.springframework.stereotype.Service;

@Service
public class UserDao {
	@Inject
	GenericDaoImpl<User> genericDaoImpl;
	
	public void save(User user) throws Exception{
		genericDaoImpl.save(user);
		//throw new Exception();
	}
	
	
}
