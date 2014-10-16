package dao;



import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import beans.User;

@Service
public class UserDao {
	@Inject
	GenericDaoImpl<User> genericDaoImpl;
	
	public void save(User user) throws Exception{
		genericDaoImpl.save(user);
		//throw new Exception();
	}
	
	
}
