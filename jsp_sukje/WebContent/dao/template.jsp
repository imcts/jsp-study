<%@page import="dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	LoginDao login=(LoginDao)session.getAttribute("login");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="30%">
		<tr>
			<td>
				<jsp:include page="<%=login.getMainurl() %>"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>