<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="ff" value="aaa.jpg"/> 
	<%-- <c:set var="ext" value="${ff.lastIndexOf('.') }"/> --%>
	<%-- <br>${ext }  --%>
<ct:indexOOOf str="${ff }"/>
<ct:now/>

<c:forEach begin="1" end="6" var="i">

<ct:hh title="ㅋㅋㅋㅋㅋㅋ" level="${i }"/>



</c:forEach>
</body>
</html>