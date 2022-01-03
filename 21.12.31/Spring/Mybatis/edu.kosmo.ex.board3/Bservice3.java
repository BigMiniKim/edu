package edu.kosmo.ex.board3;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.kosmo.ex.vo.BoardVO;


@Service
public class Bservice3 {
	
	@Inject
private BMapper bMapper;
	
	public List<BoardVO> selectBoardList() throws Exception {	
		
		return bMapper.selectList();
	}

}
