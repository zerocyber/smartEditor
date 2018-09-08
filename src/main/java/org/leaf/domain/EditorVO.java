package org.leaf.domain;

import java.util.Date;

import lombok.Data;

@Data
public class EditorVO {

	private int eno;
	private String title;
	private String contents;
	private Date regdate;
}
