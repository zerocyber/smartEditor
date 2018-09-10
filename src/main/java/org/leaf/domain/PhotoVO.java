package org.leaf.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;


@Data
public class PhotoVO {

	//photo_uploader.html의 form 태그 안의 file 태그 name을 일치시키기
	private MultipartFile Filedata; 
	//callback url
	private String callback;
	//callback 함수
	private String callback_func;
	
}
