package com.summer.app.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@GetMapping("login")
	public String memberLogin(Model model)throws Exception{
		return "member/login";
	}
}
