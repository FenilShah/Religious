package org.devdarshan.controllers;

import org.devdarshan.beans.Contact;
import org.devdarshan.service.PageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	
	@Autowired
	PageServices pageServices;
	
	@RequestMapping("index")
	public String homePage(Model model){
		//model.addAttribute("linkId", "aboutLink");
		pageServices.homePageDerasars(model);
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
		model.addAttribute(new Contact());
		return "contact";
	}
	
	@RequestMapping("submitContactDetails")
	public String submitContactDetails(Model model, Contact contact){
		pageServices.saveContactDetails(contact);
		return "redirect:contact.htm";
	}
	
	@RequestMapping("details")
	public String detailPage(@RequestParam("id") Integer derasarId,Model model){
		pageServices.getDerasarImages(derasarId, model);
		return "Detail";
	}
	
	@RequestMapping("detailsFrame")
	public String detailFramePage(@RequestParam("id") Integer derasarId,Model model){
		System.out.println("Derasar Id " + derasarId);
		pageServices.getDerasar(derasarId, model);
		return "DetailFrame";
	}
}
