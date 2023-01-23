package com.xworkz.webproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4,urlPatterns = "/amithbachan")
public class AmithabachanServlet extends HttpServlet {
	public AmithabachanServlet() {
		System.out.println("Amithabachan Servlet created ");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Amithabachan is an great Actor");
	}

}
