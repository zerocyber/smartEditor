package org.leaf.mapper;

import java.util.List;

import org.leaf.domain.Criteria;
import org.leaf.domain.EditorVO;

public interface EditorMapper {

	public List<EditorVO> list(Criteria cri);
	public int write(EditorVO vo);
}
