package com.codingdojo.routing;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@RequestMapping("/coding")
public class RoutingController {
	@RequestMapping("")
	public String hello() {
		return "Hello coding dojo";
	}
	@RequestMapping("/python")
	public String python(){
		return "Python was awesome";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java/spring sucks";
	}
}
