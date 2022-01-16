package com.git.maven.MavenProject1.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {

	@GetMapping
	public String showMessage()
	{
		return "Hello How are you";
	}
}
