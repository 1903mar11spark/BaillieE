package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4217738150363355737L;

	@Override //checking to make sure it the method below actually exists somewhere else
	//do not override service method
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//PrintWriter - writes directly to the response body --there are other ways this is just most correct
		PrintWriter pw = resp.getWriter();
		pw.write("Hello world!");
	}
}
