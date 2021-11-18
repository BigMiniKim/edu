package edu.kosmo.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/post") // 
public class PostMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostMethod() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//치고 들어온 정보가 다 request에 들어옴. 응답을 주기 위한 객체 response
		System.out.println("<h1>GET!!</h1>");
		PrintWriter writer = response.getWriter(); 
		response.setContentType("text/html; charset=euc-kr");
		System.out.println("<h1>GET!!</h1>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello!");
		response.setContentType("text/html; charset=euc-kr"); //header구성
		PrintWriter writer = response.getWriter(); // IOStream socket.getOutputstream() response
		
		writer.println("<html>"); //writer로 연결. 계속 해제.
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>post방식입니다. doPost호출입니다.</h1>");
		for (int i=1; i<=9; i++ ) {
			for (int j =2; j<=9; j++) {
				
				writer.println(i + "*" + j + "=" + (i*j) + "<br>");
			}
		}
		
		writer.println("<body>");
		writer.println("<html>");
		System.out.println("포스트 호출");
		
	}
	

}
