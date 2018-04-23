package Springmain.controller;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.WelcomeService;

import org.springframework.web.bind.annotation.GetMapping;
@RestController
@ComponentScan("com.springboot.service")
public class MainController {
 
@Autowired
WelcomeService wservice;
	
@GetMapping("/hello")
public String  hello(){
	System.out.println("the hello servlet bis called");
	return "hiiii";
}
@GetMapping("/service")
public String Display(){
	System.out.println("the service servlet is called");
	return wservice.Message();
}

@GetMapping("/index")
public String index(){
	return "index";
}
}
