package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

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
}
