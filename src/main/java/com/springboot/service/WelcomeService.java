package com.springboot.service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class WelcomeService {
public String Message(){
	return "hello service provider";
}
}
