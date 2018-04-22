package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class WelcomeMsgServices {

	public String retrieveWelcomeMessage() {
		//Complex Method
		return "Good Morning updated";
	}
	

	public String retrieveWelcomeMessage2() {
		//Complex Method
		return "Good Morning Manisha";
	}
}

