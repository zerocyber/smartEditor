<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스마트 에디터 테스트1</title>

<script type="text/javascript"
	src="/resources/workspace/js/service/HuskyEZCreator.js" charset="utf-8"></script>

</head>
<body>

	<div class="text">

		<form method="post">
		
			<input type="text" name="title">

			<textarea id="editor" name="contents" rows="10" cols="100"></textarea>

			<input type="button" id="writeBtn" value="등록">

		</form>

	</div>

</body>

<script type="text/javascript">
var oEditors = [];
nhn.husky.EZCreator.createInIFrame({
    oAppRef: oEditors,
    elPlaceHolder: "editor",
    sSkinURI: "/resources/workspace/SmartEditor2Skin.html",
    htParams : {
        // 툴바 사용 여부 (true:사용/ false:사용하지 않음)
        bUseToolbar : true,            
        // 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
        bUseVerticalResizer : true,    
        // 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
        bUseModeChanger : true,
    }
});

</script>

<script type="text/javascript">

window.onload = function() {
	
	var btn = document.getElementById("writeBtn");
	btn.onclick = function(){
		
		submitContents(btn);
	}
}


function submitContents(elClickedObj){
	
	oEditors.getById["editor"].exec("UPDATE_CONTENTS_FIELD",[]);
	
	try{
		
		elClickedObj.form.submit();
	}catch(e){
		
	}
}

</script>

</html>