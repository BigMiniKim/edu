package edu.kosmo.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.kosmo.ex.page.Criteria;
import edu.kosmo.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {

	List<BoardVO> getList();

	BoardVO read(int bid);

	void insert(BoardVO board);

	void delete(int bid);
	void update( BoardVO board);
	//void update(@Param("board") BoardVO board); //BoardMapper.xml 에서 #{board.bname}, #{board.btitle}, #{board.bcontent}....
	//void update(@Param("board") BoardVO board, @paran("emp") Emp emp) #{board.bname} #{emp.salary}
	//void update(@Param("bid") int bid, @Param("bcontent") String bcontent, @Param("btitle") String btitle);//단일이 아닌 다수 객체 @Param

	void updateHit(int bid);
	
	//댓글관련
	void updateShape(BoardVO boardVO);

	void insertReply(BoardVO boardVO);
	
	//페이징 처리 관련
	int getTotalCount();
	List<BoardVO> getListWithPaging(Criteria criteria);
}
