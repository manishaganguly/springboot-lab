package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.WelcomeMsgServices;

@RestController
public class WelcomeController {

	// Auto wiring
	@Autowired
	private WelcomeService service;

	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage2();
	}

	// Auto wiring
	@Autowired
	private WelcomeMessages msg;

	@RequestMapping("/welcome1")
	public String welcome1() {
		return msg.retrieveWelcomeMessage();
	}
	
	
	// Auto wiring
		@Autowired
		private WelcomeMsgServices welcomeMsg;

		@RequestMapping("/welcomeExt")
		public String welcomeMsg() {
			return welcomeMsg.retrieveWelcomeMessage();
		}

}

@Component
class WelcomeService {

	public String retrieveWelcomeMessage() {
		// Complex Method
		return "Good Morning updated";
	}

	public String retrieveWelcomeMessage2() {
		// Complex Method
		return "Good Morning Manisha";
	}
}
