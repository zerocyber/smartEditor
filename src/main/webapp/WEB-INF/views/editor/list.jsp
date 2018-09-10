<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<table>
			<tbody>
				<c:forEach items="${editorVO}" var="list">

					<tr>
						<td>${list.eno}</td>
						<td><a href="/editor/read?eno=${list.eno}">${list.title}</a></td>
						<td>${list.regdate}</td>

					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
	<button id="writeBtn">글쓰기</button>
</body>
<script type="text/javascript">
	window.onload = function() {

		var writeBtn = document.getElementById("writeBtn");
		console.log(writeBtn);

		writeBtn.onclick = function(){
			console.log("글쓰기 클릭");
			location.href = "/editor/write";
		}

	}
</script>
</html>