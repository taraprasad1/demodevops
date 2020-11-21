package com.example.demodevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test")
	public String testResource() {
		return "hello world";
	}
	@GetMapping("test1")
	public String testResource1() {
		return "hello world everyone";
	}
}
