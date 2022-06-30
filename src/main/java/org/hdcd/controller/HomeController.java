package org.hdcd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/Home")
	public String Home() {
		return "home";
	}
	
	@GetMapping("/map")
	public String Map() {
		return "map";
	}
	
	@GetMapping("/test")
	public String Test() {
		return "test";
	}
	
}
