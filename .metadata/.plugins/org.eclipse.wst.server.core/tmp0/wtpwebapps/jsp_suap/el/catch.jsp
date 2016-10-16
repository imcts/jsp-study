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
		

 
<c:set var="sum" value="0"/>
 
<c:forEach begin="1" end="40" step="1" var="i">
	<c:if test="${i<11 }">
		<c:choose>
			<c:when test="${i%3==0 }"><br>짝</c:when>
			<c:otherwise><br>${i }</c:otherwise>
		</c:choose>
	</c:if>
 
 	<c:if test="${i>10 && i<21 }">
 		<c:choose>
			<c:when test="${(i-1)%3==0 }"><br>짝</c:when>
			<c:otherwise><br>${i }</c:otherwise>
		</c:choose>
 	</c:if>
 
 	<c:if test="${i>20 && i<30 }">
 		<c:choose>
			<c:when test="${(i+1)%3==0 }"><br>짝</c:when>
			<c:otherwise><br>${i }</c:otherwise>
		</c:choose>
 	</c:if>
 
 	
 	
</c:forEach>
 
 
 
 
 
 
</body>
</html>