package org.devdarshan.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class BasicInterceptor implements HandlerInterceptor{
	static Logger logger = Logger.getLogger(BasicInterceptor.class);
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception exception)
			throws Exception {
		// TODO Auto-generated method stub
		logger.info("After rendering the view");
		
		if(exception!=null){
			logger.error("Exception occured " + ExceptionUtils.getStackTrace(exception));
			if(NullPointerException.class==exception.getClass())
				System.out.println(exception.getClass());
		}
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView model) throws Exception {
		// TODO Auto-generated method stub
		logger.info("After handling the request");
		if(model!=null){
			logger.info("Returning View --> " + model.getViewName());
			
		}	
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Before handling the request");
		
		/*Enumeration<String> e = request.getHeaders("Referer");
		while(e.hasMoreElements()){
		System.out.println("Previous Page " + e.nextElement());
		}*/
		logger.info("Context Path " + request.getContextPath());
		
		logger.info("In " + handler.getClass() + " --> " + request.getRequestURI());
		return true;
	}

}
