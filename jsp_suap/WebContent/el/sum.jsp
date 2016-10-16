<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ct:sum end="10" st="1">
		${sss }
	</ct:sum>
	
	<br>////////////////////////////////////////////<br>
	
	<ct:sum2 end="10" var="aaa" st="1"/>
	
	${aaa }
	
	<br>////////////////////////////////////////////<br>
	<%-- 
	<ct:sum3 var="bbb">에러나서 주석달음.
		10
	</ct:sum3>
	
	${bbb } --%>
	
</body> 
</html>