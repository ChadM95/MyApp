package com.example.MyApp;

import com.example.MyApp.entity.User;
import com.example.MyApp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepo) {
		return args -> {
			System.out.println("Entering CommandLinerunner");

			//read
			System.out.println("printing all users in db :");
			userRepo.findAll().forEach(System.out::println);

		};
	}



}
