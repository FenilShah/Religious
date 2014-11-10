package org.devdarshan.service;

import org.apache.log4j.Logger;
import org.devdarshan.beans.City;
import org.devdarshan.beans.Contact;
import org.devdarshan.beans.Derasar;
import org.devdarshan.dao.CityDao;
import org.devdarshan.dao.ContactDao;
import org.devdarshan.dao.DerasarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class PageServices {
	private static Logger logger = Logger.getLogger(PageServices.class);
	
	@Autowired
	CityDao cityDao;
	
	@Autowired
	DerasarDao derasarDao;
	
	@Autowired
	ContactDao contactDao;
	
	public void homePageDerasars(Model model){
		logger.info("In home page derasar method");
		City city = cityDao.findById(1);
		/*System.out.println(city.getCityName());
		for(Derasar derasar : city.getDerasarList()){
			System.out.println("Derasar name " + derasar.getDerasarName());
		}*/
		//return city;
		//city.getDerasarList();
		model.addAttribute(city);
	}
	
	public void getDerasar(Integer derasarId, Model model){
		 Derasar derasar = derasarDao.findById(derasarId);
		 //System.out.println(derasar.getDerasarName());
		 model.addAttribute(derasar);
	}
	
	public void getDerasarImages(Integer derasarId, Model model){
		 Derasar derasar = derasarDao.findById(derasarId);
		 //System.out.println(derasar.getDerasarImages().get(0).getImagePath());
		 model.addAttribute("derasarImages",derasar.getDerasarImages());
	}
	
	public void saveContactDetails(Contact contact){
		contactDao.save(contact);
	}
}
