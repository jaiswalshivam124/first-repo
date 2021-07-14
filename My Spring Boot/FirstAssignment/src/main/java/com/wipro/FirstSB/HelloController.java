package com.wipro.FirstSB;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@RequestMapping("/bankname")
	public String respond() {
		return "HSBC";
	}
	
	
	@RequestMapping("/bankaddress")
	public String resp() {
		return "Bangalore";
	}
	
}
