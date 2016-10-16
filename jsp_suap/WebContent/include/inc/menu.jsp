<%@page import="basic.Hobby"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table width="100%">


	<%
		String sub = request.getParameter("sub");
		ArrayList<Hobby> menu = ((HashMap<String, ArrayList<Hobby>>) application
				.getAttribute("menu")).get(request.getParameter("sub"));

		for (Hobby mm : menu) {
	%>
	<tr>
		<td><a href="?sub=<%=sub%>&main=<%=mm.getValue()%>"><%=mm.getStr()%></a>
		</td>
		<%
			}
		%>

	</tr>
</table>
