package com.example.springbootjpaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringbootJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaExampleApplication.class, args);
	}

}
