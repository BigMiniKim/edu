package edu.kosmo.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kosmo.ex.mapper.BoardMapper;
import edu.kosmo.ex.vo.BoardVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Service

public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		log.info("getList()...");
		return boardMapper.getList();
	}

	@Override
	public BoardVO get(int bid) {
		log.info("get()...");
		return boardMapper.read(bid);
	}

	@Override
	public void register(BoardVO board) {
		
		log.info("register()...");
		
		boardMapper.insert(board);
	}
	

	
}
