package com.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value = "/hi")
	public String hi()
	{
		System.out.println("hi");
		return "welcome.jsp";
	}
	
	@RequestMapping(value = "/calc")
	public ModelAndView add(Integer num1, Integer num2)
	{
		Calculator c = new Calculator();
		ModelAndView model = new ModelAndView();
		
		model.addObject("result", "Result: "+c.add(num1, num2));
		model.setViewName("index.jsp");
		return model;
	}

}
