package edu.kosmo.ex.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.inject.Inject;
import javax.sql.DataSource;

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
public class BoardMapperTest {

	@Inject
	private BoardMapper boardMapper;

	@Test
	public void testBoardMapper() {

		assertNotNull(boardMapper);
		log.info(boardMapper);
	}

	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setBcontent("룰룰랄라");
		board.setBtitle("아무거나");
		board.setBname("홍길동");

		boardMapper.insert(board);
		log.info(board);
	}

	@Test
	public void testGetList() {
		for (BoardVO board : boardMapper.getList()) {
			log.info(board);
		}

	}
}
