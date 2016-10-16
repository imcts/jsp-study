<%@page import="dao.Person"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	LoginDao login= (LoginDao)session.getAttribute("login");

	ArrayList arr = login.userInfo();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%">
<h4 align="center">유저 상세 정보</h4>
	<tr>
		<td>이름</td>
		<td>나이</td>
	</tr>
	<%for(int i=0; i<arr.size(); i++){ %>
		<tr>
			<td><a href="?detailInfo=<%=((Person)arr.get(i)).getId()%>"><%=((Person)arr.get(i)).getName() %></a></td>
			<td><%=((Person)arr.get(i)).getAge() %></td>
		</tr>
	<%} %>
</table>
</body>
</html>