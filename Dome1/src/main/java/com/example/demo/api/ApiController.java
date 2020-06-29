package com.example.demo.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ApiController {

	@GetMapping("/add")
	public Map<String, Object> foo(int a,int b){
		int result=a+b;
		HashMap<String , Object> data =new HashMap<>();
		data.put("result", result);
		return data;
	}
	
}
