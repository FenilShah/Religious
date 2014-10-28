package org.devdarshan.controllers;

import java.io.IOException;
import java.util.zip.DataFormatException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.devdarshan.beans.User;
import org.devdarshan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class UserController {
	
	@Autowired
	UserDao userDao;

	@RequestMapping("userRegistrationPage")
	public String userRegistrationPage(@ModelAttribute User user){
 
		//ModelAndView model = new ModelAndView("UserRegistration");
		//model.addObject("msg", "hello world");
 
		return "UserRegistration";
	}
	
	@RequestMapping("userRegistrationSubmit")
	public String userRegistrationSubmit(HttpServletRequest request, HttpServletResponse response, User user) throws Exception{
		//.out.println(user.getDisplayName());
		userDao.save(user);
		
		return null;
		
	}
	
	@RequestMapping("login")
	public String userLogin(@ModelAttribute User user,HttpServletRequest request, HttpServletResponse response) throws DataFormatException{
 
		//ModelAndView model = new ModelAndView("UserRegistration");
		//model.addObject("msg", "hello world");
		/*boolean throwException = true;

	    if (throwException) {
	      throw new DataFormatException("This is my DataFormatException");
	    }*/
		return "UserLogin";
	}
	
	@RequestMapping("userLoginSubmit")
	public void userLoginSubmit(HttpServletRequest request, HttpServletResponse response, User user) throws IOException{
 
		//ModelAndView model = new ModelAndView("UserRegistration");
		//model.addObject("msg", "hello world");
 
		response.sendRedirect("login.htm");
	}
	
	@ExceptionHandler(DataFormatException.class)
	  @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "My Response Status Change….!!")
	  public void handleDataFormatException(DataFormatException ex,
	      HttpServletResponse response) {

	   /* logger.info("Handlng DataFormatException - Catching: "
	        + ex.getClass().getSimpleName());*/
	  }
}
