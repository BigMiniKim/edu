package edu.kosmo.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kosmo.ex.dao.BDao;
import edu.kosmo.ex.dto.BDto;

public class BListCommand implements Bcommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		BDao dao = new BDao(); //DAO 객체 생성
		ArrayList<BDto> dtos = dao.list(); // 게시판 list 함수 호출
		request.setAttribute("list", dtos); // request 안에 list 라는 이름으로 게시판 넣기 jsp 에서 el로 써먹기 위해
	

	}

}
