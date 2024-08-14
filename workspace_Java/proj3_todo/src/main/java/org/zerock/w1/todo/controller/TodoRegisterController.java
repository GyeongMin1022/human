package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;


@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register doGet 실행");
		request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register doPost 실행");
		
		String title  = request.getParameter("title");
		String dueDate= request.getParameter("dueDate");
		String finishied  = request.getParameter("finishied");
		
		TodoDTO todoDTO = new TodoDTO();
		todoDTO.setTitle(title);
		todoDTO.setDueDate(LocalDate.parse(dueDate));
		if("N".equals(finishied)) {
			todoDTO.setFinished(false);
		} else {
			todoDTO.setFinished(true);
		}

		System.out.println(todoDTO);
		
	}

}
