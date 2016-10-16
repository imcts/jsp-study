<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="num" required="true" type="java.lang.Integer"%>
<%@ attribute name="bun" required="true" type="java.lang.Integer"%>


<c:choose>
	<c:when test="${num>90}">
		수 : <font color="#FF0000">${bun }</font>
	</c:when>
	<c:when test="${num>80}">
		우 : <font color="#FFBB00">${bun }</font>
	</c:when>
	<c:when test="${num>70}">
		미 : <font color="#1DDB16">${bun }</font>
	</c:when>
	<c:when test="${num>60}">
		양 : <font color="#00D8FF">${bun }</font>
	</c:when>
	<c:otherwise>
		가  :<font color="#5F00FF">${bun }</font>
	</c:otherwise>
</c:choose>