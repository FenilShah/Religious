package org.devdarshan.dao;

import javax.inject.Inject;

import org.devdarshan.beans.Derasar;
import org.springframework.stereotype.Service;

@Service
public class DerasarDao {
	@Inject
	GenericDaoImpl<Derasar> genericDaoImpl;
	
	Derasar derasar = new Derasar();
	
	public Derasar findById(Integer id){
		return (Derasar) genericDaoImpl.findById(derasar, id);
	}
}
