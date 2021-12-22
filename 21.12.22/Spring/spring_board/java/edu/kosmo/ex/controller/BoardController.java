package edu.kosmo.ex.controller;

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

import edu.kosmo.ex.service.BoardService;
import edu.kosmo.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class BoardController {
	
	@Inject
	private BoardService boardService;
	
	@GetMapping("/list")
	public String list (Model model) {
		
		log.info("list()...");
		
		model.addAttribute("boardList", boardService.getList());
		
		return "board/list";
	}
	//http://localhost:8282/ex/content_view?bid=27
	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		
		log.info("content_view()...");
		log.info("BoardVO" + boardVO);
		
		int bid = boardVO.getBid();
		
		model.addAttribute("content_view", boardService.get(bid)) ;
		
		return "board/content_view";
			
			
		}
	@GetMapping("/write_view")
	public String write_view() {
		
		log.info("write_view()...");
				
		return "board/write_view";
			
			
		}
	
	@PostMapping("/write")
	public String write(BoardVO boardVO) {
		
		log.info("write()...");
		boardService.register(boardVO);
		
		return "redirect:list";
			
			
		}
	}

