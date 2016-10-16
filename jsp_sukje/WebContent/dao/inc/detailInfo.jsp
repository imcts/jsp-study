<%@page import="dao.Person"%>
<%@page import="dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	LoginDao login = (LoginDao)session.getAttribute("login");
	Person per = login.getPer();
	
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="100%" height="100">
	<h3 align="center">유저 상세 정보 보기</h3>
		<tr>
			<td colspan="2" >
				<img width="400" src="../image/<%=login.getImage()%>">
			</td>
			
		</tr>
		
		<tr>
			<td width="100">이름 : </td>
			<td><%=per.getName() %></td>
		</tr>
		<tr>
			<td width="100">나이 : </td>
			<td><%=per.getAge() %></td>
		</tr>
		<tr>
			<td width="100">연락처 : </td>
			<td><%=per.getTel() %></td>
		</tr>
		<%if(login.getLoginid().equals(per.getId())){ %>
			<tr>
				<td colspan="2" align="center">
					<a href="?memberOut=1&outid=<%=per.getId()%>">회원탈퇴</a>
				</td>
			</tr>
		<%} %>
		
	</table>
</body>
</html>