package org.devdarshan.controllers;

import org.devdarshan.beans.City;
import org.devdarshan.beans.Derasar;
import org.devdarshan.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@Autowired
	CityDao cityDao;
	
	@RequestMapping("index")
	public String homePage(Model model){
		//model.addAttribute("linkId", "aboutLink");
		return "Index";
	}
	
	@RequestMapping("about")
	public String aboutPage(Model model){
		model.addAttribute("linkId", "aboutLink");
		return "about";
	}
	
	@RequestMapping("awards")
	public String awardPage(Model model){
		model.addAttribute("linkId", "awardsLink");
		return "awards";
	}
	
	@RequestMapping("contact")
	public String contactPage(Model model){
		model.addAttribute("linkId", "contactLink");
		return "contact";
	}
	
	@RequestMapping("details")
	public String detailPage(Model model){
		return "Detail";
	}
	
	@RequestMapping("detailsFrame")
	public String detailFramePage(Model model){
		City city = cityDao.findById(1);
		System.out.println(city.getCityName());
		for(Derasar derasar : city.getDerasarList()){
			System.out.println("Derasar name " + derasar.getDerasarName());
		}
		return "DetailFrame";
	}
}
