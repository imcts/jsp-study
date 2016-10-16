<%@page import="java.util.ArrayList"%>
<%@page import="fowardSung.Student"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="fowardSung.SungJukMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	SungJukMap ss = (SungJukMap)request.getAttribute("ss");
	
	HashMap studMap = ss.getStudMap();
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="0" width="100%">
	<tr align="center">
		<td>이름</td>
		<td>성별</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
		<td>총점</td>
		<td>평균</td>
		<td>등급</td>
	</tr>
	<tr>
	<%
	ArrayList arr = ss.wantList(ss.getHaknyun(), ss.getBan());
	for(int i=0; i<arr.size(); i++){ %>
		<%if(i%8==0){ %>
			</tr><tr>
			<%} %>
		<td align="center"><%=arr.get(i) %></td>
			
	
	
	<%-- 	<tr align="center">
				<td><%= ((Student)((List)((Map)studMap.get(ss.getHaknyun())).get(ss.getBan())).get(i)).getName() %></td>
				<td><%= ((Student)((List)((Map)studMap.get(ss.getHaknyun())).get(ss.getBan())).get(i)).getGen() %></td>
				<td><%= ((Student)((List)((Map)studMap.get(ss.getHaknyun())).get(ss.getBan())).get(i)).getKor() %></td>
				<td><%= ((Student)((List)((Map)studMap.get(ss.getHaknyun())).get(ss.getBan())).get(i)).getEng() %></td>
				<td><%= ((Student)((List)((Map)studMap.get(ss.getHaknyun())).get(ss.getBan())).get(i)).getMat() %></td>
				<td><%= ((Student)((List)((Map)studMap.get(ss.getHaknyun())).get(ss.getBan())).get(i)).getSum() %></td>
				<td><%= ((Student)((List)((Map)studMap.get(ss.getHaknyun())).get(ss.getBan())).get(i)).getAvg() %></td>
				<td><%= ((Student)((List)((Map)studMap.get(ss.getHaknyun())).get(ss.getBan())).get(i)).getGrade() %></td>
		</tr> --%>
		
		<%} %> 
		</tr>
	</table>
</body>
</html>