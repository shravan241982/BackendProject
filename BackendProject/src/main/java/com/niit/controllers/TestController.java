package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	public TestController(){
		System.out.println("creating test controller");
	}
	@RequestMapping("/")
	public String aboutus(){
		return "index";
	}
}
