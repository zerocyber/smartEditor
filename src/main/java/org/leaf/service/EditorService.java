package org.leaf.service;

import java.util.List;

import org.leaf.domain.Criteria;
import org.leaf.domain.EditorVO;

public interface EditorService {

	public List<EditorVO> editorList(Criteria cri);
	public int editorWrite(EditorVO vo);
}
