package com.second;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class controller implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        System.out.println("handleRequest called...");		
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("msg", "hello Good morning Spring students.");
		modelAndView.addObject("msg1", "hello1 Good morning Spring students.");
		return modelAndView;
		
	}

}
