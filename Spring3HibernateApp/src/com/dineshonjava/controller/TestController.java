package com.dineshonjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test")
public class TestController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView welcome() {
		System.out.println("teswt");
		return new ModelAndView("index");
	}

}
