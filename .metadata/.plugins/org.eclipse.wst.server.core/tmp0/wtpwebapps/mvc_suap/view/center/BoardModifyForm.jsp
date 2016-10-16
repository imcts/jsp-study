<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function fileDelete(){
		if(confirm("파일을 삭제하시겠습니까")){
			var frm = document.frm;
			frm.action="FileDelete.bo";
			frm.submit();
		}
	}
</script>
</head>
<body>
<form name="frm" action="BoardModify.bo" method="post" enctype="multipart/form-data">
	<table border="1">
	<input type="hidden" name="id" value="${data.id }" />
	<input type="hidden" name="page" value="${data.page }" />
	
	<tr>
		<td>제목</td>
		<td><input type="text" name="title" value="${data.title }" /></td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input type="text" name="pname" value="${data.pname }"/></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><textarea rows="5" cols="30" name="content">${data.content }</textarea></td>
	</tr>
	
<c:if test="${data.seq==0 }">	
<c:choose>	
	<c:when test="${data.upfile!='' }">
		<input type="hidden" name="upfile" value="${data.upfile }" />
		<td>파일</td>
		<td>
			${data.upfile }
			<input type="button" value="삭제" onclick="fileDelete()">
		</td>
	</c:when>
	<c:otherwise>
	
	<tr>
		<td>파일</td>
		<td><input type="file" name="upfile" /></td>
	</tr>
	</c:otherwise>
</c:choose>
</c:if>


	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="작성" />
			<input type="reset" value="취소" />
			<input type="button" value="뒤로" onclick="location.href='BoardDetail.bo?id=${data.id}&page=${data.page }'"/>
		</td>
	</tr>
	</table>
</form>
</body>
</html>