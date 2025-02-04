package com.example.demo.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.loginForm.LoginForm;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String init(Model model) {
		return "login";
	}
	
	@PostMapping("/post")
	public String create(@ModelAttribute LoginForm loginForm) {
		System.out.println("Username : " + loginForm.getUsername());
		System.out.println("Password :" + loginForm.getPassword());
		return "redirect:/login";
	}

}
