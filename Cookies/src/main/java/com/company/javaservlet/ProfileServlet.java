package com.company.javaservlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

public class ProfileServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		
		System.out.println("Inside JavaServlet Project Init Method Profile Servlet");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		req.getRequestDispatcher("link.jsp").include(req, resp);

		Cookie ck[] = req.getCookies();
		if (ck != null) {
			String name = ck[0].getValue();
			if (!name.equals("") || name != null) {
				out.print("<b>Welcome to Profile</b>");
				out.print("<br>Welcome, " + name);
				System.out.println("Cookie in ProfileServlet");

			}
		} else {
			out.print("Please login first");
			req.getRequestDispatcher("login.jsp").include(req, resp);
		}
		out.close();
	}
}
