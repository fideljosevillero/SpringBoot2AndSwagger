package com.fideljose.otherController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/other")
public class OtherController {

	@GetMapping("/aqui")
	public String other() {
		return "Other!!!";
	}
	
}
