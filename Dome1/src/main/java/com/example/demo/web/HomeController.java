package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index.html";
	}
	
	@GetMapping("/news")
	public String news() {
		return "news.html";
	}
	
	@GetMapping("/game")
	public String game() {
		//请求转发 ,url不变
		//return "abc";
		//重定向转发
		//return "redirect:abc";
		return "redirect:https://www.baidu.com/s?wd=car";
	}
	
	@GetMapping("/abc")
	public String abc() {
		return "game.html";
	}
}
