package edu.kosmo.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kosmo.ex.dao.BDao;
import edu.kosmo.ex.dto.BDto;

public class BListCommand implements BCommand { //Bcommand 상속. 자손이 구현해야함 viewPage=list.jsp

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list(); // sql 구문 다 끌고옴. select*
		request.setAttribute("list", dtos); //reueest 객체 안에 게시판("list",dtos)을 setAttribute 예전엔 .jsp 실무에서는 따로 command
	
	}

}
