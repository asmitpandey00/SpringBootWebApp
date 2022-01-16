package com.git.maven.MavenProject1.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {

	@GetMapping("/show")
	public String showMessage()
	{
		System.out.println("asmit pandey");
		//returning value
		return "Hello How are you";
	}
}
