package edu.kosmo.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.kosmo.ex.member.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {

	// http://localhost:8282/ex/board/confirm?id=abcd&pw=1234&addr=seoul
	@RequestMapping("board/confirm")
	public String home(HttpServletRequest request, Model model) {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String addr = request.getParameter("addr");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("addr", addr);

		return "board/confirm";// "board/confirm.jsp"
	}

	@RequestMapping("board/check")
	public String check(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {

		model.addAttribute("identify", id);
		model.addAttribute("password", pw);

		return "board/check";
	}

	// http://localhost:8282/ex/member/join?name=abcd&id=1234&pw=qwer5678
	@RequestMapping("member/join")
	public String join(Member member) {
		/*
		 * command객체(데이터객체) 스프링 내부적으로 new 생성, member 객체생성해서 name,id,pw에 해당하는
		 * setter함수(setName등등)를 호출해서 값을 넣어줌. model.addAttribute()역할까지 해줌 member이라는 이름으로
		 * join.jsp 에 넘김
		 */

		return "member/join"; // "member/join.jsp"
	}

	@RequestMapping("member/input")
	public String input() {

		return "member/input";
	}
}
