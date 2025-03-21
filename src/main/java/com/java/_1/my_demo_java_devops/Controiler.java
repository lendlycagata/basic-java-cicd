package com.java._1.my_demo_java_devops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controiler {

	@Autowired
	private DemoService demoService;

	@GetMapping("/hello")
	public String Hello() {
		return this.demoService.Hello();
	}

}
