<%@page import="basic.Hobby"%>
<%@page import="java.util.ArrayList"%>
<%@page import="basic.MovieMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<table width="100%">
	<tr align="center">
	
	
<%
	MovieMenu mm = (MovieMenu)request.getAttribute("mm");

	ArrayList<Hobby> menu = mm.getMenu().get("top");
	
	for(Hobby hh : menu){
		String url= mm.getMenu().get(hh.getValue()).get(0).getValue();
%>
	
		<td>
			<a href="../<%=hh.getValue()%>/<%=url%>.jsp?sub=<%=hh.getValue() %>"><%=hh.getStr()%></a>
		</td>
	

<% }%>

</tr>
</table>