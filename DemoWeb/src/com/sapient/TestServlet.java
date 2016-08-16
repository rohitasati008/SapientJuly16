package com.sapient;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
//@WebServlet("/TS")
public class TestServlet extends HttpServlet {
	
    public TestServlet() {
       
    }
    
    public void init(){
    		System.out.println("only one time");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service method....");
		String value = request.getParameter("color");
		response.getWriter().println("<h1>Current Date from the server: </h1>" + value + new Date());
	}
	
	public void destroy(){
		System.out.println("destroyed at last");
	}
	
	
	
	
	

}
