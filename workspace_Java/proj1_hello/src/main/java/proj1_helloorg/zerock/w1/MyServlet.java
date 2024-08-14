package proj1_helloorg.zerock.w1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
// @WebServlet의 전달인자 글씨로 주소가 연결됨
// 원래는 전달인자로 urlPattrens={주소1, 주소2}이렇게 적을 수 있고
// 책처럼 name등 다른 요소도 넣을 ㅜㅅ 있지만
// 주소 하나만 쓰는 경우 모두 생략할 수 있다
@WebServlet("/My")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("MyServlet 생성자 실행");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() 실행");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// get방식으로 요청한 경우 doGet 메소드를 톰켓이 실행해준다.
	// 우리는 doGet을 override해서 원하는 알고리즘을 수행 할 수 있다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Get실행");
		// HttpServletRequst : 요청에 관련된 모든 내용이 들어있다
		// HttpServletResponse : 요청에 관련된 모든 내용이 들어있다
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<h1 style=\"color : red;\">");
		out.print(" Hello Servlet\n");
		out.println("</h1>");
		
		out.println("<h1>");
		for(int i=1; i<10;i++) {
			out.print("2 * "+ i +"= "+2*i + "<br>");	
		}
		out.println("</h1>");
		
	}

}
