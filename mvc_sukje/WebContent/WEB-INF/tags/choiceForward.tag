<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="var" required="true" %>

<%
	
	boolean index = false; //다운로드인지 아닌지구분하기 위한 인덱스.
	
	if(var.equals("DownRoad")){ //커맨드값이 다운로드라면.
		index=true;//트루로 변경.
	}
%>

<c:choose>
	<c:when test="<%=index %>"><!--인덱스가 트루라면  -->
		<jsp:forward page="../center/DownRoad.jsp"/><!--다운로드.jsp포워딩. -->
	</c:when>
	<c:otherwise><!--index가 false라면  -->
		<jsp:include page="../center/${var }.jsp"/><!--해당 comman.jsp인클루드.  -->
	</c:otherwise>
</c:choose>