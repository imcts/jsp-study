<%@page import="album.AlbumBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="70%">
	<h3 align="center">기획사 홈페이지</h3>
		<tr>
			<td colspan="2" height="50">
				<jsp:include page="inc/top.jsp"></jsp:include>
			</td>
		</tr>
		
		<tr >
			<td width="20%">
				<jsp:include page="inc/menu.jsp"></jsp:include>
			</td>
			<td align="center">
				<jsp:include page="${bean.mainUrl }"></jsp:include>
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