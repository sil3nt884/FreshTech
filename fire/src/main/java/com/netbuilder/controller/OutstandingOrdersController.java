package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class OutstandingOrdersController {

	 @RequestMapping("OutstandingOrders")
	 public String  OutstandingOrders(ModelAndView modelAndView) {
	        return "OutstandingOrders";
	  }
	
}