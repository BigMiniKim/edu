package edu.kosmo.ex.board3;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import edu.kosmo.ex.vo.BoardVO;

public interface BMapper {
	
	@Select("select * from mvc_board order by bGroup desc, bStep asc")		
	public List<BoardVO> selectList();

}
