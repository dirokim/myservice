package com.summer.app.member;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface MemberDAO {

	public int createBoard()throws Exception;
	
}
