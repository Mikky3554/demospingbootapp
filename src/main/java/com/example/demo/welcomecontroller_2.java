
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomecontroller_2 {

	@GetMapping("/")
	public String welcome() {
		return "docker file Deployment";
	}
}
