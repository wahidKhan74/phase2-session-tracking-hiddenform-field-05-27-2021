package com.mcit.webapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInfoServlet
 */
@WebServlet("/user-info")
public class UserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfoServlet() { }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("userId");
		String userName = request.getParameter("name");
		
		// create hidden form fields
		out.println("<form method='post' action='profile' >");
		out.println("<input type='hidden' name='userId' id='userId' value='"+userId+"'>");
		out.println("<input type='hidden' name='userName' id='userName' value='"+userName+"'>");
		out.println("<input type='submit' value='Go to Profile'>");
		out.println("</form>");
		
		out.close();	
		
	}

}
