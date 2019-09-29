package com.insuranceprotfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InsuranceprotfolioController {

	@RequestMapping("/")
	public ModelAndView getHomePage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/registerationPage")
	public ModelAndView getRegisterPage() {
		return new ModelAndView("registerationPage");
	}
	
}
