package edu.kosmo.ex.vo;

import static org.junit.Assert.*;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class BoardVOTest {

	private BoardVO boardVO = null;

	public BoardVOTest() {
		boardVO = new BoardVO();
	}

	@Test
	public void testBoardVO() {
		assertNotNull(boardVO);

	}

	@Test
	public void testSetBname() {

		boardVO.setBname("kim");
		assertEquals("kim", boardVO.getBname());
		

	}
	
	@Test
	public void testSetBid() {

		boardVO.setBid(20);
		assertEquals(20, boardVO.getBid());
		

	}
}
