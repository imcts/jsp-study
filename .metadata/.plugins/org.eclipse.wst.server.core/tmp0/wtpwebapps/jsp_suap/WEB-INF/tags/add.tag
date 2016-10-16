<%@ tag body-content="empty" language="java" pageEncoding="UTF-8"%>
<%@ attribute name="num" required="true" type="java.lang.Integer" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	
	int sum=0,number=1;
%>

<c:forEach begin="1" end="${num }" varStatus="no">

<%
	sum+=number;
	number++;
%>

<br>${no.index } : <%=sum %>

</c:forEach>