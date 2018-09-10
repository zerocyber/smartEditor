package org.leaf.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.leaf.domain.Criteria;
import org.leaf.domain.EditorVO;
import org.leaf.mapper.EditorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model, HttpServletRequest req) throws UnsupportedEncodingException {
		log.info("list page 들어왔습니다.");
		req.setCharacterEncoding("utf-8");
		model.addAttribute("editorVO",mapper.list(cri));
	}
	
	@GetMapping("/test1")
	public void editor() {
		
		log.info("test1 들어왔습니다.");
		
	}
	
	@PostMapping("/test1")
	public String editorPost(EditorVO vo, HttpServletRequest req){

		log.info("전송버튼 누름");
		mapper.write(vo);
		log.info(vo);
		
		return "redirect:/editor/list";
	}
	
	@GetMapping("/read")
	public void read(Model model, @Param("eno") int eno) {
		
		model.addAttribute("editorVO", mapper.read(eno));
		log.info("read페이지 들어왔습니다.");
	}
	
}
