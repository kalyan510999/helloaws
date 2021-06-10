package com.kalyan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String hellomessage() {
		return "vannu gadiki istamaina number 4";
	}

}
