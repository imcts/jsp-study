<%@page import="movie.Menu"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="movie.Movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Movie movie = (Movie)request.getAttribute("movie");
	HashMap map = movie.getMap();
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="0" align="center">
	<%for(int i=0; i< ((List)map.get(movie.getMenuKey())).size(); i++ ){ %>
	<tr valign="center">
		<td>
			<a href="?mainkey=<%=((Menu)((List)map.get(movie.getMenuKey())).get(i)).getKey() %>&menukey=<%=movie.getMenuKey()%>"><%=((Menu)((List)map.get(movie.getMenuKey())).get(i)).getValue() %></a>
		</td>
	</tr>		
	<%} %>
</table>
</body>
</html>