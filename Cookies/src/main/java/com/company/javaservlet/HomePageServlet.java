package com.company.javaservlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/home")
public class HomePageServlet extends HttpServlet {

		public void init() { //overridden from http from generic - inheritance 
			
			System.out.println("Inside JavaServlet Project Init Method Home Page Servlet");
		}

		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Inside doGet");
			resp.getWriter().write("<h1> GET is not supported :</h1>");
			
			
//			Cookie ck = new Cookie("user", "aditi"); 
//			ck.setMaxAge(0);
//			resp.addCookie(ck);
//			System.out.println("Cookie added");
//			
//			Cookie ck1[] = req.getCookies();
//			
//			for(int i=0; i<ck1.length; i++) {
//				System.out.println("<br>" + ck1[i].getName() + " " + ck1[i].getValue());
//			}
			
			

		}

		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Inside doPost");
			String fname = req.getParameter("userPass");
			resp.getWriter().write("<h1> Welcome from home page " + fname + ":: </h1>");


			
			
		}

		public void destroy() {

		}
	}

