package com.stewart.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@GetMapping("/")
	public String Root() {
		return "Hello, welcome to my humble site";
	}
	
	@GetMapping("/random")
	public String Random() {
		return "This is a random message.";
	}
}
