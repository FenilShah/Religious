package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import beans.User;

@Controller
public class SchoolMaster {
	@RequestMapping("SchoolMasterRegistrationPage")
	public ModelAndView schoolMasterRegistrationPage(){
 
		ModelAndView model = new ModelAndView("AskQuestions");
		model.addObject("user", new User());
 
		return model;
	}
}
