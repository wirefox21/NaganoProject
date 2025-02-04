package com.example.demo.LoginController;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.LoginDto.LoginDto;
import com.example.demo.LoginService.LoginService;
import com.example.demo.loginForm.LoginForm;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	ModelMapper modelMapper;
	
	@GetMapping("/login")
	public String init(Model model) {
		List<LoginDto> dtoList = loginService.search();
		model.addAttribute("dtoList", dtoList);
		return "login";
	}
	
	@PostMapping("/post")
	public String registerUser(LoginForm loginForm){
		loginService.registerUser(modelMapper.map(loginForm, LoginDto.class));
		return "redirect:/login";
		
	}

}
