<%@page import="fowardSung.SungJukMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	SungJukMap ss = (SungJukMap)request.getAttribute("ss");

%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3 align="center">학생 성적 관리부</h3>
	<table border="1" align="center" width="60%">
		<tr>
			<td colspan="2" align="center">
				<jsp:include page="inc/top.jsp"></jsp:include>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="right"><%=ss.getHaknyun() %>학년 <%=ss.getBan() %>반</td>
		</tr>
		
		<tr>
			<td width="10%">
				<jsp:include page="inc/menu.jsp"></jsp:include>
			</td>
			<td>
				<jsp:include page="veiw/main.jsp"></jsp:include>
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