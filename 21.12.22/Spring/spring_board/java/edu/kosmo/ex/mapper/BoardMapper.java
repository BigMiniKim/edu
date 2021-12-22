package edu.kosmo.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kosmo.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	
List<BoardVO>getList();
BoardVO read(int bid);
void insert(BoardVO board);
	
}
