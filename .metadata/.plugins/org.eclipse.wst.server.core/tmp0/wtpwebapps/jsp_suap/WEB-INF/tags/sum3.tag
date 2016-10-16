<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="var" required="true" rtexprvalue="false"%> <!-- 그냥 값을 받아만 오는 그릇으로 쓰는것.
아래있는놈은 그냥 뭐랄까 위에서 받아온 값을 변수이름 지정하고 내보내는 방식지정하고 스타일 지정해서 내보내주는것.  -->
<%@ variable name-from-attribute="var" variable-class="java.lang.Integer" scope="AT_END" alias="res"%>

<jsp:doBody var="context"/>


<%

	String context = (String)jspContext.getAttribute("context");

	int end = Integer.parseInt(context.trim());



%>

<c:set var="res" value="0"/>
<c:forEach begin="${0 }" end="<%=end %>" var="nn">
	<c:set var="res" value="${res+nn }"/>
</c:forEach>




