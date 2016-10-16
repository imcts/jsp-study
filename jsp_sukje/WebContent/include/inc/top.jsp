
<%@page import="sungJuk.Menu"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="0" width="100%">
<tr>
	<%for(int i=0; i< ((List)((Map)application.getAttribute("menu")).get("top")).size(); i++){%>
		<td align="center"><a href="?haknyun=<%=((Menu)((List)((Map)application.getAttribute("menu")).get("top")).get(i)).getMenu() %>">
		<%= ((Menu)((List)((Map)application.getAttribute("menu")).get("top")).get(i)).getValue() %></a></td>
	<%} %>
</tr>
</table>
</body>
</html>