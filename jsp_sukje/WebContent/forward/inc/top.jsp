<%@page import="fowardSung.Menu"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="fowardSung.SungJukMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	HashMap menuMap=((SungJukMap)request.getAttribute("ss")).getMenuMap();

%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="0" width="100%">
		<tr>
		<%for(int i=0; i<((List)menuMap.get("top")).size(); i++){ %>
		
			<td align="center">
				<a href="?haknyun=<%=((Menu)((List)menuMap.get("top")).get(i)).getKey()%>">
				<%=((Menu)((List)menuMap.get("top")).get(i)).getValue() %></a>
			</td>
		
		<%} %>
		
		</tr>
	</table>
</body>
</html>