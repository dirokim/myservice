package com.summer.app.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("create")
	public ModelAndView createBoard(@ModelAttribute BoardVO boardVO,ModelAndView mv) throws Exception {
			mv.setViewName("index");
			mv.addObject("path","board/create");
		return mv;
	}
	
	@PostMapping("create")
	public void createBoard(Model model)throws Exception{
		boardService.createBoard();
	
	}
}
