package com.codingdojo.string;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class StringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "Hello Client How are you ";
	}
	@RequestMapping("/random")
	public String random() {
		return "This is a random pages welcome  to the page Have fun";
	}

}
