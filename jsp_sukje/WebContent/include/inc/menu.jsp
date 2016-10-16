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
	<table>
		<%for(int i=1; i<=3;i++){ //메뉴에서도 학년값을 다시 줄 필요가있네. %>
		<tr>
		<td><a href="?haknyun=<%=request.getParameter("haknyun") %>&menuItem=<%=((Menu)((List)((Map)((Map)application.getAttribute("menu")).get("menu")).get(i+"")).get(i-1)).getMenu()%>">
		<%=((Menu)((List)((Map)((Map)application.getAttribute("menu")).get("menu")).get(request.getParameter("haknyun"))).get(i-1)).getValue()%></a>
		</td>
		</tr>
	<%} %>
	</table>
</body>
</html>