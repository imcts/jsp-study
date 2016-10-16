<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="examReg.jsp" method="post">
		<table border="1">
		
		<tr>
		<td>이름</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
		</tr>
		<%for(int i=0; i<5; i++){ %>
			<tr>
				<td><input type="text" size="5" name="name"></td>
				<td><input type="text" size="5" name="kor"></td>
				<td><input type="text" size="5" name="eng"></td>
				<td><input type="text" size="5" name="mat"></td>
			</tr>
		<%} %>
		
			<tr>
			<td align="center" colspan="4"><input type="submit" value="확인"></td>
			</tr>
		</table>
		</form>
</body>
</html>