package edu.kosmo.ex.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.kosmo.ex.vo.BoardVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTest {

	@Inject
	private BoardService boardService;

	@Test
	public void testBoardService() {

		assertNotNull(boardService);
		log.info(boardService);
	}

@Ignore
public void testGetList() {
	List<BoardVO> list =boardService.getList();
	log.info(boardService);
	
	for(BoardVO boardVO : list) {
		System.out.println(boardVO);
	}
	
}

@Test 
public void testGet() {
	
	BoardVO board = boardService.get(490);
	System.out.println(board);
	}
	
	

@Test 
public void testRemove() {
	boardService.remove(490);
	
	BoardVO board = boardService.get(490);
	System.out.println("확인 = " + board);
	}
}
