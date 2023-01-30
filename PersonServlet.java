package com.xworkz.person;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/fav")
public class PersonServlet extends HttpServlet {
	public PersonServlet() {
		System.out.println("Person Details");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String  fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String gender = req.getParameter("gen");
		String reason = req.getParameter("reason");
		String address = req.getParameter("address");
		
		System.out.println("fname" + fname);
		System.out.println("lname" + lname);
		System.out.println("gen" + gender);
		System.out.println("reason" + reason);
		System.out.println("address" + address);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("gen", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address",address);

		dispatcher.forward(req, resp);
	}

}
