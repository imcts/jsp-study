<%@page import="cookie.Cookie_c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<%
	
	Cookie_c cookie=(Cookie_c)request.getAttribute("cookie");
	%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

		<table border="1">
		<tr>
			<h3 align="center">로그인 성공</h3>
		</tr>
			<tr>
				<td name="logout" value="1"><%=cookie.getId() %>님 환영합니다.</td>				
			</tr>
			
			<tr>
				<td align="center">
					<a href="?logout=1">로그아웃</a>
				</td>
			</tr>
		</table>


	
</body>
</html>