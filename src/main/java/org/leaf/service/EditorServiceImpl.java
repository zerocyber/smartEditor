package org.leaf.service;

import java.util.List;

import org.leaf.domain.Criteria;
import org.leaf.domain.EditorVO;
import org.leaf.mapper.EditorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
public class EditorServiceImpl implements EditorService{

	
	@Setter(onMethod_=@Autowired)
	private EditorMapper mapper;
	
	public List<EditorVO> editorList(Criteria cri){
		return mapper.list(cri);
	}
	
	public int editorWrite(EditorVO vo) {
		return mapper.write(vo);
	}

	@Override
	public EditorVO editorRead(int eno) {
		return mapper.read(eno);
	}
	
}
