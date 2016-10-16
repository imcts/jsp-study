<%@page import="album.Menu"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="album.AlbumBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	AlbumBean bean = (AlbumBean) request.getAttribute("bean");
	ArrayList arr = (ArrayList) bean.getMenuMap().get("top");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="0" width="100%">
		<tr>
			<%for (int i = 0; i < arr.size(); i++) {%>
			<td align="center"><a href="?menukey=<%=((Menu) arr.get(i)).getKey()%>"><%=((Menu) arr.get(i)).getValue()%></a></td>
			<%}%>
		</tr>
	</table>
</body>
</html>