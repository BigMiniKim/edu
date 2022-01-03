package edu.kosmo.ex.board2;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.kosmo.ex.vo.BoardVO;


@Service
public class Bservice2 {
	
	@Inject
	SqlSession sqlSession;
	
	public List<BoardVO> selectBoardList() throws Exception {
		return sqlSession.selectList("board.selectBoardList");
		
	}

}
