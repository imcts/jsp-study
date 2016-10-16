<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table border="1">
			<tr>
				<td>직업</td>
				<td>
					<select name="job">
						<option value="doctor" selected="selected">의사</option>
						<option value="viper">독사</option>
						<option value="nobuy">안사</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>
					<ct:select name="email2" key="네이버" naver.com="네이버" daum.net="다음" nate.com="네이트" gmail.com="지메일"/>
				</td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>