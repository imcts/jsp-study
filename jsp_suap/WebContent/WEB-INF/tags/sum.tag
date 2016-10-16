<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="st" required="true" type="java.lang.Integer"%>
<%@ attribute name="end" required="true" type="java.lang.Integer"%>
<%@ variable name-given="sss" variable-class="java.lang.Integer" scope="NESTED"%>

<c:set var="sss" value="0"/>
<c:forEach begin="${st }" end="${end }" var="nn">
	<c:set var="sss" value="${sss+nn }"/>
</c:forEach>

<jsp:doBody/>



