<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="100%" align="center">
		<tr>
	<c:forEach items="${bean.menuMap.get('top')}" var="menu">
			<td align="center">
				<a href="?menukey=${menu.key }">${menu.value }</a>
			</td>
	</c:forEach>
		</tr>
	</table> 
</body>
</html>