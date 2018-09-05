package org.leaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/editor/*")
@Log4j
public class TestController {


	@GetMapping("/test1")
	public void editor() {
		
		log.info("test1 들어왔습니다.");
		
	}
	
}
