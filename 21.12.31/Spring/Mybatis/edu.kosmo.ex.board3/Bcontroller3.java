package edu.kosmo.ex.board3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.kosmo.ex.page.Criteria;
import edu.kosmo.ex.page.PageVO;
import edu.kosmo.ex.service.BoardService;
import edu.kosmo.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;



@Log4j
@Controller
public class BController3 {
	
	@Inject
	private Bservice3 bservice3;
	
	@GetMapping("/listthree")
	public String listtwo(Model model) throws Exception {
		
		log.info("listthree() ..");
		model.addAttribute("boardList", bservice3.selectBoardList());
		
		return "board/list";
		
	}
}
