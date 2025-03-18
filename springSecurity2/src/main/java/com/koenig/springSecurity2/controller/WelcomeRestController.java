package com.koenig.springSecurity2.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/Welcome")
	public String getMsg() {
		String msg = "Welcome to Koenig";
		return msg;
	}
}
