package edu.kosmo.ex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kosmo.ex.command.BCommand;
import edu.kosmo.ex.command.BContentCommand;
import edu.kosmo.ex.command.BDeleteCommand;
import edu.kosmo.ex.command.BListCommand;
import edu.kosmo.ex.command.BModifyCommand;
import edu.kosmo.ex.command.BReplyCommand;
import edu.kosmo.ex.command.BReplyViewCommand;
import edu.kosmo.ex.command.BWriteCommand;

/**
 * Servlet implementation class BoardFrontController
 */
@WebServlet("*.do")
public class BController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet"); //.do로 들어오는건 얘가 처리함
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("actionDo");
		
		request.setCharacterEncoding("EUC-KR");
		
		String viewPage = null;
		BCommand command = null;
		
		String uri = request.getRequestURI(); //1.list.do를 빼오기 위한 작업
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		System.out.println(uri);
		System.out.println(conPath);
		System.out.println(com);
		
		
		if(com.equals("/list.do")) {
			command = new BListCommand(); //2.BListcommand 객체 생성
			command.execute(request, response);
			viewPage = "list.jsp";
		} else if(com.equals("/write_view.do")) {
			viewPage = "write_view.jsp";
		} else if(com.equals("/write.do")) {
			command = new BWriteCommnad(); 
			command.execute(request, response); // insult 시키고 list.do로 가라(맨 위)
			viewPage = "list.do";
		}	
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage); //request객체에다가 viewPage를 설정하면 유저에게 viewPag?list.jsp?를 보여줌.
		dispatcher.forward(request, response);//request, response 객체를 list.jsp에다가 forwarding //4.포워딩 해서 유저에게 보여줌. list.do
	}
}
