package com.netbuilder.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	
	@RequestMapping("product")
	public String pageControll(ModelAndView modelAndView){
		return "Product.jsp";
	}
}