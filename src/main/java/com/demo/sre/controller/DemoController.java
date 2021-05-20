package com.demo.sre.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home() {
		return "Hello World";
	}

}
