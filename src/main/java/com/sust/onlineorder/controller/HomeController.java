package com.sust.onlineorder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: wangzongyu
 * @Date: 2019/2/13 21:32
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/home")
	public String home() {
		System.out.println("redirect to home page!");
		return "index";
	}


	@RequestMapping(value = "/home/page")
	@ResponseBody
	public ModelAndView goHome() {
		System.out.println("go to the home page!");
		ModelAndView mode = new ModelAndView();
		mode.addObject("name", "zhangsan");
		mode.setViewName("index");
		return mode;
	}

}
