package com.example.demo.LoginEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "information")
public class LoginEntity {
	private String username;
	private String password;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
