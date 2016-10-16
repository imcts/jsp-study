<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="PwChk.bo" method="post">
		<table border="1">
		<input type="hidden" value="${param.url }" name="url">
		<input type="hidden" value="${param.id }" name="id">
		<input type="hidden" value="${param.page }" name="page">
			<tr>
				<td>암호</td>
				<td>
					<input type="password" name="pw" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="확인" />
					<input type="button" value="뒤로" onclick="history.go(-1)" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>