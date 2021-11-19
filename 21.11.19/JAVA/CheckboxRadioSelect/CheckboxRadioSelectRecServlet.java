package edu.kosmo.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecServlet
 */
@WebServlet("/rectangle")
public class RecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RecServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		
			String[] hobbys=request.getParameterValues("hobby");
			String major = request.getParameter("major");
			String protocol =request.getParameter("protocol"); 

			response.setContentType("text/html; charset=euc-kr");
			PrintWriter writer = response.getWriter();

			writer.println("<html>"); // writer로 연결. 계속 해제.
			writer.println("<head>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<h1>post방식입니다. doPost호출입니다.</h1>");
			writer.println("<h1> 취미 :" + Arrays.toString(hobbys)+ "</h1>");
			writer.println("<h1> 전공 :" + major + "</h1>");
			writer.println("<h1> 프로토콜 :" + protocol + "</h1>");
			
			writer.println("<body>");
			writer.println("<html>");
			System.out.println("포스트 호출");

		} catch (Exception e) {

			response.setContentType("text/html; charset=euc-kr");
			PrintWriter writer = response.getWriter();

			writer.println("<html>"); // writer로 연결. 계속 해제.
			writer.println("<head>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<h1>에러입니다.</h1>");

			writer.println("<body>");
			writer.println("<html>");
			System.out.println("포스트 호출");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
