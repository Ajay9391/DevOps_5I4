package com.ajay.SpringBootWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello 
{

	@RequestMapping("/")
	public String getMsg()
	{
		return "Welcome to SpringBoot Web App";
	}
}
