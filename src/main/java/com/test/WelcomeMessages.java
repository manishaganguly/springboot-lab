package com.test;

import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
class WelcomeMessages {

	public String retrieveWelcomeMessage() {
		//Complex Method
		return "Good Morning updated";
	}
	

	public String retrieveWelcomeMessage2() {
		//Complex Method
		return "Good Morning Manisha";
	}
}