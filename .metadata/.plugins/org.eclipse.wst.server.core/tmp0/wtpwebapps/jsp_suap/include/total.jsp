<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String str = "ccc.jsp";
	int kk = 100;

%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	난 토탈야.<%=kk %>
	<jsp:include page="aaa.jsp">
		<jsp:param value="010-3383-1032" name="tell"/>
	</jsp:include>
	<jsp:include page="bbb.jsp"/>
	<jsp:include page="<%=str %>"/>
</body>
</html>