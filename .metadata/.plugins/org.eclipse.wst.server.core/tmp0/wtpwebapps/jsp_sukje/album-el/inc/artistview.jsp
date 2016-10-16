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
	<table border="1" width="100%">
	<tr>
		<td colspan="2" align="center"><img src="../image/${bean.mainkey }.jpg"></td>
	</tr>
		<tr align="center">
			<td align="center" width="10%">이름  </td>
			<td>${bean.artistMap.get(bean.mainkey).name}</td>
		</tr>
		<tr align="center">
			<td width="10%">나이  </td>
			<td>${bean.artistMap.get(bean.mainkey).age}</td>
		</tr>
		<tr align="center">
			<td width="10%">직업  </td>
			<td>${bean.artistMap.get(bean.mainkey).job}</td>
		</tr>
	</table>
</body>
</html>