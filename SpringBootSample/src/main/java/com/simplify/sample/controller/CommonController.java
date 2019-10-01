package com.simplify.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@RequestMapping("/")
	public String root_test() throws Exception{
		return "Hello Root(/)";
	}
	
	@RequestMapping("/demo")
	public String demo_test() throws Exception{
		return "Hello demo(/demo)";
	}
	
	@GetMapping("/test")
	public String test_test() throws Exception{
		return "Hello World";
	}
}
