package com.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Msg_Controller {
	
	//create a normal constructor
	public Msg_Controller() {
		System.out.println("It is a Constructor");
	}
	
	// here we create a method whose return type will be ResponseEntity<>. By this return type of method we want to send Custom Status code.
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMessage(){
		String msg="Welcome to our website";
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	
	// here we create a method whose return type will be normal a String. And by default its send "200" status code.
	@GetMapping("/greet")
	public String getGreetMessage() {
		String msg="Hi Buddy Apke father aye hain...!";
		return msg;
	}

}
