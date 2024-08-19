package org.zerock.w1.research.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.research.dto.ResearchDTO;
import org.zerock.w1.research.service.ResearchService;


@WebServlet("/research")
public class ResearchController extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("두겟실행");
    	ResearchService researchService  = new ResearchService();
        List<ResearchDTO> researches = researchService.getResearches();
        request.setAttribute("researches", researches);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/research.jsp");
        dispatcher.forward(request, response);
    }

}
