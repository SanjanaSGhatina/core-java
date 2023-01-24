package com.xworkz.webproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5,urlPatterns = "/modi")
public class ModiServlet extends HttpServlet {
	public ModiServlet() {
		System.out.println("modi servlet created");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Modi is a Prime Minister of India ");
	}

}