<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="nowReserveReg.jsp" method="post">
	
	영화예약
	<select name="movie">
		<option value="iron">아이언맨</option>
		<option value="super">수퍼맨</option>
		<option value="mart">마트맨</option>
	</select><br>

	인원<input type="text" name="cnt"/>
	<input type="submit" value="예약"/>
	
	</form>
</body>
</html>