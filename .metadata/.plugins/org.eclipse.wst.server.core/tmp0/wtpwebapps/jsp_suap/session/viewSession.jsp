<%@page import="basic.Exam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	
	Exam exam = (Exam)session.getAttribute("exam");
	
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>세션 보기</title>
</head>
<body>
	<%=	session.getAttribute("id") %>
	<%=	session.getAttribute("pw") %>
	<%= exam.getName() %>
</body>
</html>