<%@page import="basic.Hobby"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table width="100%">
	<tr>

		<%
			ArrayList<Hobby> menu = ((HashMap<String, ArrayList<Hobby>>) application
					.getAttribute("menu")).get("top");

			for (Hobby mm : menu) {
		%>
		<td><a href="?sub=<%=mm.getValue()%>"><%=mm.getStr()%></a></td>
		<%
			}
		%>

	</tr>
</table>
