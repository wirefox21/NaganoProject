package com.example.demo.LoginRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.LoginEntity.LoginEntity;

public interface RegistarRepository extends JpaRepository<LoginEntity, Long> {

}
