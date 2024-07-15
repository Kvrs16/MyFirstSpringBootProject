package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@ResponseBody
	@RequestMapping("/")
	public String About() {
		return "This is the Welcome msg on ResponseBody ";
		
	}
	
	@RequestMapping("/myindex")
	public String goToIndex() {
		System.out.println("This is the goToIndex() method ");
		return "index";
	}
	
	@RequestMapping("/myindex1")
	public String goToIndex1() {
		System.out.println("This is the goToIndex-1() method ");
		return "index1";
	}
}