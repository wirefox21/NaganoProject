package com.example.demo.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class LoginController {
	
	@GetMapping("/login")
	public String init(Model model) {
		return "login";
	}
	
	

}
