<%@ tag body-content="empty" language="java" pageEncoding="UTF-8"%>
<%@ tag dynamic-attributes="optionMap"  %>
<%@ attribute name="key" %>
<%@ attribute name="name" required="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<select name="${name }">
<c:forEach items="${optionMap }" var="op">
<c:choose>
<c:when test="${op.value==key }">
	<option selected="selected"  value="${op.key }">${op.value }</option>
</c:when>
<c:otherwise>
	<option  value="${op.key }">${op.value }</option>
</c:otherwise>
</c:choose>	
</c:forEach>
</select>
