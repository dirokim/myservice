package com.summer.app.board;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDAO {

	public int createBoard () throws Exception;
	
}
