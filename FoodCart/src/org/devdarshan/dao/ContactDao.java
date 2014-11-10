package org.devdarshan.dao;

import javax.inject.Inject;

import org.devdarshan.beans.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactDao {
	@Inject
	GenericDaoImpl<Contact> genericDaoImpl;
	
	
	public void save(Contact contact){
		genericDaoImpl.save(contact);
	}
}
