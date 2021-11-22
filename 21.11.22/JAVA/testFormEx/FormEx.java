package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=euc-kr"); 
		PrintWriter writer = response.getWriter(); 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String[] hobbys=request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol =request.getParameter("protocol");
		
		writer.println("<html>"); 
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		
		writer.println("<h1> ID :" + id + "</h1>");
		writer.println("<h1> PW :" + pw + "</h1>");
		writer.println("<h1> 취미 :" + Arrays.toString(hobbys)+ "</h1>");
		writer.println("<h1> 전공 :" + major + "</h1>");
		writer.println("<h1> 프로토콜 :" + protocol + "</h1>");
		writer.println("<body>");
		writer.println("<html>");
		
		
	}
	

}
