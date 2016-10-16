<%@page import="basic.MovieMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	/* String url = (String)request.getAttribute("main"); */
	
	MovieMenu mm = (MovieMenu)request.getAttribute("mm");
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" >
		<tr>
			<td colspan="2">
				<jsp:include page="inc/top.jsp"></jsp:include>
			</td>
		</tr>
		<tr>
			<td>
				<jsp:include page="inc/menu.jsp"></jsp:include>
			</td>
			<td>
				 <jsp:include page="<%=mm.getMainUrl() %>"></jsp:include> 
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<jsp:include page="inc/bottom.jsp"></jsp:include>
			</td>
		</tr>
	</table>	
</body>
</html>