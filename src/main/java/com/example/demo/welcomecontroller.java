package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomecontroller {

	@GetMapping("/")
	public String welcome() {
		return "First Jar Deployment";
	}
}
