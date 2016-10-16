<%@page import="basic.Hobby"%>
<%@page import="java.util.ArrayList"%>
<%@page import="basic.MovieMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<table width="100%">
	
	
	
<%
	MovieMenu mm = (MovieMenu)request.getAttribute("mm");

	ArrayList<Hobby> menu = mm.getMenu().get(mm.getSub());
	
	for(Hobby hh : menu){
		
%>
	<tr align="center">
		<td>
			<a href="<%=hh.getValue()%>.jsp?sub=<%=mm.getSub() %>&main=<%=hh.getValue()%>"><%=hh.getStr()%></a>
		</td>
	</tr>

<% }%>


</table>