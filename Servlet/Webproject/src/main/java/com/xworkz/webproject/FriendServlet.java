package com.xworkz.webproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 6,urlPatterns = "/friend")
public class FriendServlet extends HttpServlet {
	public FriendServlet() {
		System.out.println("Friend servlet created");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("My friend is busy in another call");
	}

}
