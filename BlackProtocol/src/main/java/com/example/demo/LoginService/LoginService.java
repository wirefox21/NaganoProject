package com.example.demo.LoginService;

import java.util.List;

import com.example.demo.LoginDto.LoginDto;

public interface LoginService {
	List<LoginDto> search();
	void registerUser(LoginDto loginDto);

}
