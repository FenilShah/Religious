package org.devdarshan.dao;

import javax.inject.Inject;

import org.devdarshan.beans.City;
import org.springframework.stereotype.Service;

@Service
public class CityDao {
	@Inject
	GenericDaoImpl<City> genericDaoImpl;
	
	City city = new City();
	
	public City findById(Integer id){
		return (City) genericDaoImpl.findById(city, id);
	}
}
