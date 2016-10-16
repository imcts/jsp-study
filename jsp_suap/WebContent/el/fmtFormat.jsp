<%@page import="java.util.HashMap"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%

	HashMap map = new HashMap();
	
	map.put("월", "月");
	map.put("화", "火");
	map.put("수", "水");
	map.put("목", "木");
	map.put("금", "金");
	map.put("토", "土");
	map.put("일", "日");

	request.setAttribute("map", map);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="now" value="<%=new Date() %>"></c:set>
<c:set var="num" value="12345.67890"></c:set>
${num }<br>
<fmt:formatNumber value="${num }" type="number" var="nn"></fmt:formatNumber><br>
${nn.concat("100") }<br>

<fmt:formatNumber value="${num }" type="currency" currencySymbol="원"></fmt:formatNumber><br>
<fmt:formatNumber value="${num }" type="percent" groupingUsed="false" ></fmt:formatNumber><br>
<fmt:formatNumber value="${num }" pattern="반장꺼졍#,###.######" ></fmt:formatNumber><br>
<fmt:parseNumber var="nnn" pattern="빠세000.##" value="빠세123.45678"></fmt:parseNumber>
${nnn +200}<br>
${now }<br>
<fmt:formatDate value="${now }" type="date" dateStyle="short"/><br>
<fmt:formatDate value="${now }" type="date" dateStyle="full"/><br>
<fmt:formatDate value="${now }" type="time" timeStyle="short"/><br>
<fmt:formatDate value="${now }" type="time" timeStyle="full"/><br>
<fmt:formatDate value="${now }" type="both" dateStyle="short" timeStyle="short"/><br>
<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/><br>
<fmt:formatDate value="${now }" type="both" dateStyle="short" timeStyle="full"/><br>
<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="short"/><br>


<fmt:formatDate value="${now }" pattern="쁘아세!!!yyyy-MM-dd a HH:mm:ss (EEEE)"/><br>

'<fmt:formatDate  value="${now }" pattern="yyyy"/>年
<fmt:formatDate  value="${now }" pattern="MM"/>月
<fmt:formatDate  value="${now }" pattern="d"/>日(
<fmt:formatDate var="day1" value="${now }" pattern="E"/>
${map.get(day1) } 
)<fmt:formatDate  value="${now }" pattern="HH:mm:ss"/>


<fmt:parseDate value="1986-03-20" pattern="yyyy-mm-dd" var="myday"/>
<br>${myday }



</body>
</html>