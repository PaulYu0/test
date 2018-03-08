package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {
	
	@Autowired
	private Environment environment;
	
	
	@GetMapping("/hello")
	public String sayHello(){
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("grade"));
		return "hello,springBootaaa!!";
	}
	
	@GetMapping("/user")
	public String user(){
		return "User.html";
	}
	
}
