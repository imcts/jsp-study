<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
<table border="1" width="100%">
	<h3 align="center">회원가입 입니다.</h3>
	<tr>
		<td>id : </td>
		<td>
			<input type="text" name="newid">
		</td>
	</tr>
	<tr>
		<td>pw : </td>
		<td>
			<input type="password" name="newpassword">
		</td>
	</tr>
	<tr>
		<td>이름 : </td>
		<td>
			<input type="text" name="newname">
		</td>
	</tr>
	<tr>
		<td>연락처 : </td>
		<td>
			<input type="text" name="newtel">
		</td>
	</tr>
	<tr>
		<td>나이 : </td>
		<td>
			<input type="text" name="newage">
		</td>
	</tr>
	
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="가입">
		</td>
	</tr>
</table>
</form>

</body>
</html>