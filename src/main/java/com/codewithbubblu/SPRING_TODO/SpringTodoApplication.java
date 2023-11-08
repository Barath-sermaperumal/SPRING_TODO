package com.codewithbubblu.SPRING_TODO;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTodoApplication implements CommandLineRunner {
	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SpringTodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
