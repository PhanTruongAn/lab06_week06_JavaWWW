package com.example;

import com.example.backend.modules.User;
import com.example.backend.responsitory.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class Week06Lab06JavaWwwApplication {
	@Autowired
	private UserResponsitory userResponsitory;
	public static void main(String[] args) {
		SpringApplication.run(Week06Lab06JavaWwwApplication.class, args);
	}
	//    @Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			Optional<User> op = userResponsitory.getloginAcount("phanan1234@gmail.com","1");
			System.out.println(op);
		};
	}
}
