<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	Calendar cal = Calendar.getInstance();
	Calendar cal2 = Calendar.getInstance();
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>연간 달력</title>
</head>
<body>
	<table border="1" cellspacing="1" cellpadding="10">
	<tr>
	<td colspan="3" align="center">2014년</td>
	</tr>
	<tr>
	
	<%for(int d=1; d<13; d++){
		cal.set(Calendar.MONTH, d-1);%>
		<td>
		
		
		
		
		<table border="1" width="300" height="300" >
		<tr>
			<td colspan="7" align="center"><%=d%>월</td>
		</tr>
		<tr>
			<td align="center" style="color : red;">일</td>
			<td align="center">월</td>
			<td align="center">화</td>
			<td align="center">수</td>
			<td align="center">목</td>
			<td align="center">금</td>
			<td align="center" style="color : blue;">토</td>
		</tr>
		<tr>
		<%
		cal.set(Calendar.DATE, 1);
		for(int i=1; i<cal.get(Calendar.DAY_OF_WEEK);i++){ %>
			<td></td>
		<%} %>
		
		<%for(int j=1; j<=cal.getActualMaximum(Calendar.DATE); j++){ 
			cal.set(Calendar.DATE, j);		%>
			<%if(cal2.get(Calendar.DATE)==j && (cal2.get(Calendar.MONTH)+1)==d){ %>
			<td align="center" style="color:yellow;"><%=j%></td>
			<%}else if(cal.get(Calendar.DAY_OF_WEEK)==1){ %>
			<td align="center" style="color:red;"><%=j%></td>
			<%}else if(cal.get(Calendar.DAY_OF_WEEK)==7){ %>
			<td align="center" style="color:blue;"><%=j%></td>
			<%}else{ %>
			<td align="center" style="color:black;"><%=j%></td>
			<%} %>
			
		<%if(cal.get(Calendar.DAY_OF_WEEK)==7){ %>
			</tr><tr>
		<%} %>

		<%} %>
		</tr>
	</table>







		
		</td>
	<%if(d%3==0){ %>
	</tr><tr>
	<%}}%>
	</tr>
	</table>
</body>
</html>