<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
			<tr>
				<td>작성자</td>
				<td>${param.name }</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${param.title }</td>
			</tr>
			<tr>
				<td>파일1</td>
				<td><img src="../up/${param.sys1 }">${param.ori1 }</td>
				
			</tr>
			<tr>
				<td>파일2</td>
				<td><a href="down.jsp?sys=${param.sys1 }&ori=${param.ori1 }">${param.sys1 }</a></td>
			</tr>
		</table>
</body>
</html>