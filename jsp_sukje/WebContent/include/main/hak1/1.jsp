<%@page import="sungJuk.Student"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="0" width="100%">
	<tr align="center">
		<td >이름</td>
		<td>성별</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
		<td>총점</td>
		<td>평균</td>
		<td>등급</td>
	</tr>
	
		 <%for(int i=0; i<((List)((Map)((Map)application.getAttribute("stud")).get(request.getParameter("haknyun"))).get(request.getParameter("menuItem"))).size(); i++){ %> 
		<tr align="center">
			<td><%=((Student)((List)((Map)((Map)application.getAttribute("stud")).get(request.getParameter("haknyun"))).get(request.getParameter("menuItem"))).get(i)).getName() %></td>
			<td><%=((Student)((List)((Map)((Map)application.getAttribute("stud")).get(request.getParameter("haknyun"))).get(request.getParameter("menuItem"))).get(i)).getGen() %></td>
			<td><%=((Student)((List)((Map)((Map)application.getAttribute("stud")).get(request.getParameter("haknyun"))).get(request.getParameter("menuItem"))).get(i)).getKor() %></td>
			<td><%=((Student)((List)((Map)((Map)application.getAttribute("stud")).get(request.getParameter("haknyun"))).get(request.getParameter("menuItem"))).get(i)).getEng() %></td>
			<td><%=((Student)((List)((Map)((Map)application.getAttribute("stud")).get(request.getParameter("haknyun"))).get(request.getParameter("menuItem"))).get(i)).getMat() %></td>
			<td><%=((Student)((List)((Map)((Map)application.getAttribute("stud")).get(request.getParameter("haknyun"))).get(request.getParameter("menuItem"))).get(i)).getSum() %></td>
			<td><%=((Student)((List)((Map)((Map)application.getAttribute("stud")).get(request.getParameter("haknyun"))).get(request.getParameter("menuItem"))).get(i)).getAvg() %></td>
			<td><%=((Student)((List)((Map)((Map)application.getAttribute("stud")).get(request.getParameter("haknyun"))).get(request.getParameter("menuItem"))).get(i)).getGrade() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>