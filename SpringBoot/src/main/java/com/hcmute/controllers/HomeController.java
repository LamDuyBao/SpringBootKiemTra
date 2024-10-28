package com.hcmute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.hcmute.entity.Category;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "home";
	}
	@GetMapping("/admin/home")
	public String user_index() {
		Category category;
		return "admin/home";
	}
}
