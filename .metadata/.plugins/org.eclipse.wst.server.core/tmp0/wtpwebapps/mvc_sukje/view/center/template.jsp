<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="80%">
	<h3 align="center">홈페이지 입니다.</h3>
		<tr>
			<td colspan="2">
				<jsp:include page="../inc/top.jsp"></jsp:include><!--탑 인클루드  -->
			</td>
		</tr>
		
		<tr>
			<td width="10%">
				<jsp:include page="../inc/menu.jsp"></jsp:include><!--메뉴인클루드  -->
			</td>
			<td width="70%">
				<ct:choiceForward var="${mainP }"/>	<!--command값 가져와서 choiceForward 커스텀태그 호출.  -->	
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
				<jsp:include page="../inc/bottom.jsp"></jsp:include><!--바텀 인클루드  -->
			</td>
		</tr>
		
	</table>
</body>
</html>