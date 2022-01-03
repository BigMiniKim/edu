package edu.kosmo.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kosmo.ex.mapper.BoardMapper;
import edu.kosmo.ex.page.Criteria;
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
		
		upHit(bid);
		return boardMapper.read(bid);
	}

	@Override
	public void register(BoardVO board) {
		
		log.info("register()...");
		
		boardMapper.insert(board);
	}


	@Override
	public void registerReply(BoardVO board) {

		log.info("registerReply()...");
		
		boardMapper.updateShape(board); //@Transactional의 역할. 업데이트 성공
		boardMapper.insertReply(board); //여기서 에러 남.예전엔 try catch 사용
		//2개 이상의 작업, 원복 시켜야되는 경우 @Transactional 사용해. update, delete,select제외
		
	}

	@Override
	public void remove(int bid) {
	
		log.info("remove()...");
		boardMapper.delete(bid);
		
		
	}

	@Override
	public void modify(BoardVO boardVO) {
		log.info("modify()...");
		boardMapper.update(boardVO);
		
	}

	@Override
	public void upHit(int bid) {
		log.info("uphit()...");
		boardMapper.updateHit(bid);
	}

	@Override
	public int getTotal() {
		log.info("getTotal()...");
		return boardMapper.getTotalCount();
	}

	@Override
	public List<BoardVO> getList(Criteria criteria) {
		log.info("getList()...");
		return boardMapper.getListWithPaging(criteria);
	}
	

	
}
