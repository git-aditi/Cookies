package com.company.javaservlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

//@WebServlet(value = "/login", initParams = {
//		@WebInitParam(name = "email", value = "webmaster@domain.com", description = "Email from Webmaster") })
public class LoginServlet extends HttpServlet {

	public void init() { // overridden from http from generic - inheritance
		
		System.out.println("Inside JavaServlet Project Init Method Login Servlet");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet");
		resp.getWriter().write("<h1> Registration success: GET:</h1>");

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		req.getRequestDispatcher("link.jsp").include(req, resp);

		String name = req.getParameter("userName");
		String password = req.getParameter("userPass");

		if (password.equals("admin123")) {
			out.print("You are successfully logged in!");
			out.print("<br>Welcome, " + name);

			Cookie ck = new Cookie("name", name);
			resp.addCookie(ck);
			
			System.out.println("Cookie created in LoginServlet");
		} else {
			out.print("sorry, username or password error!");
			req.getRequestDispatcher("login.jsp").include(req, resp);
		}

		out.close();
	}

	public void destroy() {

	}
}
