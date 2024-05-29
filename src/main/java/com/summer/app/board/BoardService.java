package com.summer.app.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	public int createBoard() throws Exception {
		return boardDAO.createBoard();
	}
}
