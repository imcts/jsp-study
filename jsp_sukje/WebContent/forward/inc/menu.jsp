<%@page import="fowardSung.Menu"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="fowardSung.SungJukMap"%>
<%@page import="fowardSung.Student"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	SungJukMap ss = (SungJukMap)request.getAttribute("ss");
	HashMap menuMap = ss.getMenuMap();
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="0" height="200" width="100%">
	<%for(int i=0; i<  ((List)((Map)menuMap.get("menu")).get(ss.getHaknyun())).size(); i++ ){ %>
	
		<tr align="center">
			<td>
				<a href="?haknyun=<%=ss.getHaknyun()%>&ban=<%=((Menu)((List)((Map)menuMap.get("menu")).get(ss.getHaknyun())).get(i)).getKey()%>"><%= ((Menu)((List)((Map)menuMap.get("menu")).get(ss.getHaknyun())).get(i)).getValue() %></a>
			</td>
		</tr>
		
	<%} %>
		
	</table>


</body>
</html>