package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import functions.SortList;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServletSort extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServletSort() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		SortList sortList = new SortList();
		request.getRequestDispatcher("Sort.jsp").include(request, response);
		pw.println("<span style='color:black'>Result: "
				+ sortList.sortList(new ArrayList<>(Arrays.asList(request.getParameter("s1").split(",")))));
	}

}
