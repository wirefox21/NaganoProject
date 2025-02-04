package com.example.demo.LoginRepository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.LoginEntity.LoginEntity;

@Mapper
public interface LoginRepository {
	public List<LoginEntity> search();
	

}
