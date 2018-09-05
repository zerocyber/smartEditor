package org.leaf.service;

import org.leaf.domain.EditorVO;
import org.leaf.mapper.EditorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
public class EditorServiceImpl implements EditorService{

	
	@Setter(onMethod_=@Autowired)
	private EditorMapper mapper;
	
	public int editorWrite(EditorVO vo) {
		return mapper.write(vo);
	}
}
