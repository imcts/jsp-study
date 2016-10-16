<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String [] arr = {"허윤미","전효성","한가은","케이트 업튼","서유리"};
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach begin="0" end="10" step="1" var="i">
		<br>${i }
	</c:forEach>
<br>
<c:forEach items="<%=arr %>" var="str" varStatus="no">
	${no.index }-${str }<br>
</c:forEach>

<c:forTokens items="허윤미,전효성,한가은,.케이트업튼,서유리" delims=",." var="girl" varStatus="no">
	${girl }<br>
</c:forTokens>

<c:set var="name" value="으헤헤헤헤헤" scope="request"></c:set>
<c:import url="import.jsp?name=케헤헤헤헤헤"></c:import>

<br>
<c:redirect url="redirect.jsp">
	<c:param name="name" value="으켕켕켕"></c:param>
</c:redirect>
</body>
</html>