package org.devdarshan.service;

import org.apache.log4j.Logger;
import org.devdarshan.beans.City;
import org.devdarshan.beans.Derasar;
import org.devdarshan.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class PageServices {
	private static Logger logger = Logger.getLogger(PageServices.class);
	
	@Autowired
	CityDao cityDao;
	
	public void homePageDerasars(Model model){
		logger.info("In home page derasar method");
		City city = cityDao.findById(1);
		System.out.println(city.getCityName());
		for(Derasar derasar : city.getDerasarList()){
			System.out.println("Derasar name " + derasar.getDerasarName());
		}
		//return city;
		//city.getDerasarList();
		model.addAttribute(city);
	}
}
