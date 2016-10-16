<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="100%" align="center">
		<c:forEach items="${bean.menuMap.get(bean.menukey)}" var="menu">
		<tr align="center">
			<td><a href="?menukey=${bean.menukey }&mainkey=${menu.key}">${menu.value }</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>