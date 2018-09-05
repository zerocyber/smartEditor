package org.leaf.controller;

import org.leaf.domain.EditorVO;
import org.leaf.mapper.EditorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/editor/*")
@Log4j
public class TestController {


	@Setter(onMethod_=@Autowired)
	private EditorMapper mapper;
	
	@GetMapping("/test1")
	public void editor() {
		
		log.info("test1 들어왔습니다.");
		
	}
	
	@PostMapping("/test1")
	public String editorPost(EditorVO vo) {

		log.info("전송버튼 누름");
		mapper.write(vo);
		log.info(vo);
		
		
		return "redirect:/home";
		
	}
	
}
