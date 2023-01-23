package com.xworkz.webproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3,urlPatterns = "/fastrack")
public class fastrackServlet extends HttpServlet {
	public fastrackServlet() {
		System.out.println("fastrack servlet created");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("fastrack watch is one of top brand");
	}

}
