package com.example.demo.LoginService;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.LoginDto.LoginDto;
import com.example.demo.LoginEntity.LoginEntity;
import com.example.demo.LoginRepository.LoginRepository;
import com.example.demo.LoginRepository.RegistarRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	RegistarRepository registarRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public List<LoginDto> search(){
		List<LoginEntity> entityList = loginRepository.search();
		List<LoginDto> dtoList = new ArrayList<>();
		for(LoginEntity entity : entityList) {
			LoginDto dto = modelMapper.map(entity, LoginDto.class);
			dtoList.add(dto);
		}
		return dtoList;
	}
	
	@Override
	public void registerUser(LoginDto loginDto) {
		LoginEntity loginEntity = modelMapper.map(loginDto, LoginEntity.class);
		registarRepository.save(loginEntity);
	}
		

}
