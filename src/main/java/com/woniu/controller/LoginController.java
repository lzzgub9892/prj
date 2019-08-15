package com.woniu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LoginController {

	@RequestMapping("save")
	public String save() {
		System.out.println("LoginController.save()");
		System.out.println("LoginController.save()");
		return null;
	}
}
