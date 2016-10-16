<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String mem= (String)application.getAttribute("mem");

	Enumeration arr = (Enumeration)application.getAttributeNames();

	while(arr.hasMoreElements()){
	String name = (String)arr.nextElement();
	out.println(name+"<br>"+application.getAttribute(name)+":");
}
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>get</title>
</head>
<body>
	<%=mem%>
</body>
</html>