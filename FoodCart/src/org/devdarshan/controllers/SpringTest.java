package org.devdarshan.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Servlet implementation class SpringTest
 */
@Controller
@RequestMapping("/welcome")
public class SpringTest extends HttpServlet {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloWorld(){
 
		ModelAndView model = new ModelAndView("SchoolMasterRegistrationPage");
		model.addObject("msg", "hello world");
 
		return model;
	}
}
