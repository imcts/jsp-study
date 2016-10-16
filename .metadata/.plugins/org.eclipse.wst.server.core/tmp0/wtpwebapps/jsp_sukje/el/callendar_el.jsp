<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center" cellpadding="10" cellspacing="1">
<h3 align="center">2014年</h3>
	<tr>
		<c:forEach begin="1" end="12" var="j"> 
		<td>
		
	<c:set var="date" value="<%=new Date() %>" scope="request"/>
	
	${date.setMonth(j-1) }
	
	<c:set var="nextM" value="${date.getMonth()+1 }" scope="request"/>
	<c:set var="nextY" value="${date.getYear()+1 }" scope="request"/>
	
	<table border="1" width="300" height="300">
		<tr>
			<td colspan="7" align="center">${date.getMonth()+1 }월</td>
		</tr>
		<tr>
			<td><font color="#FF0000">일</font></td>
			<td>월</td>
			<td>화</td>
			<td>수</td>
			<td>목</td>
			<td>금</td>
			<td><font color="#0100FF">토</font></td>
		</tr>
		<tr>
			${date.setDate(1) }
			<c:forEach begin="1" end="10" var="i">
				<c:if test="${i<=date.getDay() }">
					<td></td>
				</c:if>
			</c:forEach>

		<c:forEach begin="1" end="32" var="i">
			${date.setDate(i) }
			<c:if test="${date.getYear()<nextY && date.getMonth()<nextM }">
					<c:choose>
						<c:when test="${date.getDay()==0 }">
							<td  align="center"><font color="#FF0000">
								<fmt:formatDate value="${date }" pattern="d" />
							</font></td>
						</c:when>
						<c:when test="${date.getDay()==6 }">
							<td align="center"><font color="#0100FF">
								<fmt:formatDate value="${date }" pattern="d" />
							</font></td>
						</c:when>
						<c:otherwise>
							<td align="center">
								<font color="#000000"><fmt:formatDate value="${date }" pattern="d" />
							</font></td>
						</c:otherwise>					
					</c:choose>
					
					<c:if test="${date.getDay()==6 }">
						</tr><tr>
					</c:if>
			</c:if>
		</c:forEach>
		</tr>
	</table>














		
		
		
		</td>
		<c:if test="${j % 3==0 }">
				</tr><tr>
		</c:if>
		
		
		</c:forEach>
	
	</tr>
</table>



















</body>
</html>