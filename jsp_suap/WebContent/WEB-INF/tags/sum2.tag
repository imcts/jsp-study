
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="st" required="true" type="java.lang.Integer"%>
<%@ attribute name="end" required="true" type="java.lang.Integer"%>
<%@ attribute name="var" required="true" rtexprvalue="false"%>
<%@ variable name-from-attribute="var" variable-class="java.lang.Integer" scope="AT_END" alias="res"%>




<c:set var="res" value="0"/>
<c:forEach begin="${st }" end="${end }" var="nn">
	<c:set var="res" value="${res+nn }"/>
</c:forEach>




