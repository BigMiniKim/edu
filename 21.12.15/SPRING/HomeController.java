package edu.kosmo.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//http://localhost:8282/ex/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home"; //home.jsp
	}
	
	//http://localhost:8282/ex/board/view (ex는 <artifactId>ex</artifactId>)
	@RequestMapping("/board/view")
	public String view() {
		System.out.println("view()...");
		return "board/view"; //"board/view.jsp"
	}
	//http://localhost:8282/ex/board/tel
	@RequestMapping("/board/tel")
	public String tel() {
		System.out.println("tel()...");
		return "board/tel"; //"board/tel.jsp"
	}
	
	//http://localhost:8282/ex/board/phone
	@RequestMapping("/board/phone")
	public String phone() {
		System.out.println("phone()...");
		return "board/phone"; //"board/phone.jsp"
	}
	
	//http://localhost:8282/ex/list "list.jsp"
	@RequestMapping("/list")
	public String list() {
		System.out.println("list()...");
		return "list"; //"list.jsp"
	}
	@RequestMapping("/board/content")
	public String content(Model model) { //값 넘길때, model객체
		model.addAttribute("id",30); //id에 30 저장
		model.addAttribute("pw",1234);
		
		System.out.println("content()...");
		return "board/content"; //"list.jsp"
	}
	
	@RequestMapping("/board/reply")
	public ModelAndView reply() {//model and view 
		
		ModelAndView mv = new ModelAndView(); // new를 modelandvie 객체 생성을통해
		mv.addObject("id",30); //addObject
		mv.setViewName("board/reply"); //여기로 값을 쓸수 있게
		return mv; // return. Model방식, ModelAndView방식
	}
}
