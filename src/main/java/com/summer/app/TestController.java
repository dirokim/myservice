package com.summer.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TestController {

	@GetMapping("/")
	public String test(Model model) throws Exception{
		model.addAttribute("path","temp/body");
		return "index";
	}
}
