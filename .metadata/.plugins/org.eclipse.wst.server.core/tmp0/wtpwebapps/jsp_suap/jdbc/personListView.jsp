<%@page import="basic.Person"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%
	ArrayList<Person> arr  = (ArrayList<Person>)request.getAttribute("list");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1">
		<tr>
			<td colspan="5" align="right">
				<%=session.getAttribute("id") %> 님 안녕하세요.
			</td>
		</tr>
	
		<tr align="center">
			<td>이름</td>
			<td>나이</td>
		</tr>


		<%
			for (Person per : arr) {
		%>
		<tr align="center">
			<td><a href="personDetail.jsp?id=<%=per.getId()%>"><%=per.getName() %></a></td>
			<td><%=per.getAge() %></td>
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>