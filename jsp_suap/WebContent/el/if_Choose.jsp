<%@page import="basic.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	Person per = new Person("전효성","9876-5432",24); 

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="id" value="석호야 졸려" scope="session"/>
	<br>${id} 
	<c:set var="per" value="<%=per %>"> </c:set>
	<c:set var="id" value="석호야 꺼져"></c:set>
	
	<br>${id} 
	<br>${per.name}
	
	<c:remove var="id" scope="page"/>
	
	<br>${id} 
	
	<c:if test="${10<20 }">
		<br>배고파
	</c:if>
	
	<c:set var="jum" value="88"></c:set>
	
	<c:choose>
	<c:when test="${jum>90}">
		<br>수
	</c:when>
	<c:when test="${jum>80}">
		<br>우
	</c:when>
	<c:when test="${jum>70}">
		<br>미
	</c:when>
	<c:when test="${jum>60}">
		<br>양
	</c:when>
	<c:otherwise>
		<br>가
	</c:otherwise>
	</c:choose>
	
	<c:if test="${id=='석호야 졸려' }">
		<br>목조르지마! 
	</c:if>

	
</body>
</html>