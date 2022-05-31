package com.wineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AboutController {

	@RequestMapping("about")
	public String about(ModelMap model) {
		return "about";
	}
	
}
