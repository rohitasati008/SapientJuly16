package com.sapient;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("pwd");
		String confirmPassword = request.getParameter("cpwd");
		
		User user = new User(username, password, confirmPassword);
		
		response.setContentType("text/html");
//		String jsonStr = "{\"auth\": true}";
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<table border=\"1\">");
		pw.println("<tr><td>" + user.username + "</td></tr>");
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
