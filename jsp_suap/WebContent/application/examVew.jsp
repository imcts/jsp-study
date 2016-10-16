<%@page import="java.util.LinkedHashMap"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashMap"%>
<%@page import="basic.Exam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	 request.setCharacterEncoding("utf-8");
	 LinkedHashMap map = (LinkedHashMap)application.getAttribute("exam");
	 
	
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>view</title>
</head>
<body>
	<table border="1">
	
		<tr>
		<td>이름</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
		<td>총점</td>
		<td>평균</td>
		</tr>
		
	 	<%	Iterator it = map.keySet().iterator();	
	 		for(int i=0; i<map.size(); i++){ 
	 		String key=(String)it.next();	
	 	%>
			<tr> 
			<td><%=((Exam)map.get(key)).getName()%></td>
			<td><%=((Exam)map.get(key)).getKor() %></td>
			<td><%=((Exam)map.get(key)).getEng() %></td>
			<td><%=((Exam)map.get(key)).getMat() %></td>
			<td><%=((Exam)map.get(key)).getSum() %></td>
			<td><%=((Exam)map.get(key)).getAvg() %></td>
			
			</tr>
			
		<%} %>
		
	</table>
	
</body>
</html>