<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="now" value="<%=new Date() %>" scope="request"></c:set>
	<c:set var="myday" value="<%=new Date() %>" scope="request"></c:set>
	${myday.setYear(now.getYear()+1) }
	${myday.setMonth(11) }
	${myday.setDate(14) }
	<%-- 
	다음생일까지 ${(myday.getTime()-now.getTime())/(1000*60*60*24)}일 남으셨습니다. --%>
	
	<c:choose>
		<c:when test="${myday.getDay()==0 }">
			${myday.setDate()-2 }
		</c:when>
		<c:when test="${myday.getDay()==6 }">
			${myday.setDate()-1 }
		</c:when>
	</c:choose>
	
	<br>생일 파티날자는 ${myday.getMonth() }월 ${myday.getDate() }일 입니다.

	
	
</body>
</html>