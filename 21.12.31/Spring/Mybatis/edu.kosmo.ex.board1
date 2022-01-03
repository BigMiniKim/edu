package edu.kosmo.ex.board1;

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
/*
1.interface IBDao를  XML namespac에 매핑 
<mapper namespace="edu.kosmo.ex.board1.IBDao"> 
2.sqlSession.getMapper(IBDao.class)를 이용.
* 
* 
* */


@Log4j
@AllArgsConstructor
@Controller
public class BController1 {
	
	@Inject
	private Bservice1 bservice1;
	
	@GetMapping("/listone")
	public String listone(Model model) throws Exception {
		
		log.info("listone() ..");
		model.addAttribute("boardList", bservice1.selectBoardList());
		
		return "board/list";
		
	}
}
