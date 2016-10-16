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
<form>
	<table border="1" align="center" width="70%">
	<h3 align="center">기획사 홈페이지 입니다.</h3>
		<tr>
			<td colspan="2" align="center">
				<jsp:include page="inc/top.jsp"></jsp:include>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<c:if test="${bean.loginchk==0 }">
				<c:forEach begin="0" end="44" step="1">&nbsp;</c:forEach>
					${bean.loginMap.get(bean.loginchk) }
				</c:if>
				<c:if test="${bean.loginchk==1 }">
				<c:forEach begin="0" end="100" step="1">&nbsp;</c:forEach>
					${user.id} 님 환영합니다. <a href="?logout=1">로그아웃</a>
					
				</c:if>
				
			</td>
		</tr>
		
		<tr>
			<td width="20%">
				<jsp:include page="inc/menu.jsp"></jsp:include>
			</td>
			<td>
				<jsp:include page="${bean.mainUrl }"></jsp:include>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<jsp:include page="inc/bottom.jsp"></jsp:include>
			</td>
		</tr>
		
	</table>
</form>
</body>
</html>