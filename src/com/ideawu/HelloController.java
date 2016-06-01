package com.ideawu;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ideawu
 * 
 */
public class HelloController implements Controller {
	/*
	 * private HelloManager helloManager;
	 * 
	 * public void setHelloManager(HelloManager helloManager) {
	 * this.helloManager = helloManager; }
	 */

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {


		request.setAttribute("hello_1", "你好啊, Spring!");
		request.setAttribute("hello_2", "Hello World!");

		return new ModelAndView("hello");
	}

}
