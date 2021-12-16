package edu.kosmo.ex.grade;

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
public class GradeController {

	// http://localhost:8282/ex/member/join?name=abcd&id=1234&pw=qwer5678
	@RequestMapping("grade/result")
	public String result(Grade grade) {

		return "grade/result";
	}

	@RequestMapping("grade/input")
	public String input() {

		return "grade/input";
	}

}
