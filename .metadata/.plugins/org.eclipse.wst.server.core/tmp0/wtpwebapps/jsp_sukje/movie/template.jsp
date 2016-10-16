<%@page import="movie.Movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%
	Movie movie = (Movie)request.getAttribute("movie");

%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" align="center" width="80%">
		<tr>
			<h3 align="center">영화 예매 사이트</h3>
		</tr>
		<tr>
			<td colspan="3">
				<jsp:include page="inc/top.jsp"></jsp:include>
			</td>
		</tr>
		<tr height="80%">
			<td width="10%">
				<jsp:include page="inc/menu.jsp"></jsp:include>
			</td>
			
			<td colspan="2">
				<jsp:include page="<%=movie.getMainurl() %>"></jsp:include>
			</td>
		</tr>
		<tr>
			<td colspan="3">
				<jsp:include page="inc/bottom.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>