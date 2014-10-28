package org.devdarshan.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.devdarshan.beans.SampleBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 * Servlet implementation class HibernateTest
 */
@SuppressWarnings("deprecation")
@WebServlet("/HibernateTest")
public class HibernateTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HibernateTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This Is Hibernate Test");
		final SessionFactory sessionFactory;
		try {
				sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
			
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				
				SampleBean sample = new SampleBean();
				sample.setName("Unnati");
				session.save(sample);
				session.getTransaction().commit();
				
				//ModelAndView modelAndView = new ModelAndView("carList");
				
			} catch (Throwable ex) {
			
				System.err.println("Initial SessionFactory creation failed." + ex);
			
				throw new ExceptionInInitializerError(ex);
			
			}
	}

}
