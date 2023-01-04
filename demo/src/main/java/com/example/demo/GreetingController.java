package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private UserService userServaice; 
	
	@RequestMapping("/")
	public String helloWorld(){
		System.out.println("hello");
		System.out.println(userServaice.getUserInfo());
		return "helloWorld";
	}
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping(value = "/hello")
	public String hello() {
		System.out.println("gogo");
		System.out.println("");
		return "hello world";
	}
}