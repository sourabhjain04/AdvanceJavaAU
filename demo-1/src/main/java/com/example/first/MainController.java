package com.example.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/home")
	public String homePage(Model model) {
		model.addAttribute("name","Spring boot User");
		return "home";
	}
	
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("This is contact Page");
		return "contact";
	}
}
