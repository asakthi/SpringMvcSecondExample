package com.second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerNext {

	@RequestMapping (value = "/cnc")
	public ModelAndView dis() {
		System.out.println("handleRequest called...");		
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("msg", "Spring students.");
		modelAndView.addObject("msg1", "Good morning");
		return modelAndView;
	}
}
