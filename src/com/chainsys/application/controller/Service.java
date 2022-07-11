package com.chainsys.application.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Service {
	@RequestMapping("/welcome")
public String welcomepage()
{
	return "<h1>Welcome</h1>";
}
	@RequestMapping("/home")
	public String homepage()
	{
		String html="<div>Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can \"just run\". We take an opinionated view of the Spring ...</div>";
		return html;
	}
	@RequestMapping("/getdata")
	public String getData(@RequestParam(value="city",defaultValue ="madurai")String city)
	{
		return "<h1>Welcome to "+city+"</h1>";
	}
}
