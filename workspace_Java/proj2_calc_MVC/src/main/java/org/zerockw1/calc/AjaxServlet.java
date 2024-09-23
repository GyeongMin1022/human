package org.zerockw1.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjaxServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("doGet실행");
		System.out.println(request.getParameter("id"));
		response.getWriter().println("text");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost실행");
		System.out.println(request.getParameter("id"));
		response.getWriter().println("{\"text\":\"text1\", \"key\":\"value\"}");
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPut실행");		
	
		
	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doDelete실행");		
	}

}