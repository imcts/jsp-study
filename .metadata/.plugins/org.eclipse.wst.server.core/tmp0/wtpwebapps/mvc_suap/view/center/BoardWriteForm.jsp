<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="frmAction" value="BoardWrite.bo"/>
<c:if test="${data.command!=null }">
	<c:set var="frmAction" value="BoardReply.bo"/>
</c:if>


<form action="${frmAction }" method="post" enctype="multipart/form-data">
<c:choose>
		<c:when test="${data.command==null }">
			<c:set var="content" value=""/>
		</c:when>	
		<c:otherwise>
			<c:set var="content" value="${data.content }"/>
			<input type="hidden" name="id" value="${data.id }">
			<input type="hidden" name="page" value="${param.page }">
		</c:otherwise>
</c:choose>

	<table border="1">
	
	<tr>
		<td>제목</td>
		<td><input type="text" name="title" value="${data.title }"/></td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input type="text" name="pname" /></td>
	</tr>
	<tr>
		<td>암호</td>
		<td><input type="password" name="pw" /></td>
	</tr>
	<tr>
		<td>내용</td>
		<td>
		
		
		<textarea rows="5" cols="30" name="content">${content }</textarea>
		</td>
	</tr>
	<c:if test="${data.command==null }">
	<tr>
		<td>파일</td>
		<td><input type="file" name="upfile" /></td>
	</tr>
	</c:if>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="작성" />
			<input type="reset" value="취소" />
			<input type="button" value="뒤로" onclick="history.go(-1)"/>
		</td>
	
	</tr>
	</table>
</form>
</body>
</html>