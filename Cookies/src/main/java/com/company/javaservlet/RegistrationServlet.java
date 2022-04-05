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


@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

		public void init() { //overridden from http from generic - inheritance 
			
			System.out.println("Inside JavaServlet Project Init Method Registration Servlet");
		}

		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Inside doGet");
			resp.getWriter().write("<h1> Registration success: GET:</h1>");

		}

		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Inside doPost");
			String fname = req.getParameter("fname");
			resp.getWriter().write("<h1> Registration success: POST: ::" + fname + ":: </h1>");

		}

		public void destroy() {

		}
	}

