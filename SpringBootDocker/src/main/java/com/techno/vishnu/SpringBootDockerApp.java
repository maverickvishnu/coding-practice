package com.techno.vishnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootDockerApp {

		public static void main(String[] args) {
			System.out.println("Hello docker demo Service !!!");
			SpringApplication.run(SpringBootDockerApp.class, args);

		}	
}
