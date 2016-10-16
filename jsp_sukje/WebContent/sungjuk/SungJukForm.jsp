<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%


%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align="center" >학생 정보 입력</h3>
<form action="SungJukProc.jsp" method="post">
	<table border="1" width="35%" align="center">
	
	<tr>
		<td width="5%" align="center">이름</td>
		<td width="5%" align="center">성별</td>
		<td width="5%" align="center">국어</td>
		<td width="5%" align="center">영어</td>
		<td width="5%" align="center">수학</td>
		<td width="5%" align="center">반번호</td>
		<td width="5%" align="center">번호</td>
	</tr>
	<tr>
		<td><input size="5%" type="text" name="name1"></td>
		<td><input size="5%" type="text" name="gen1"></td>
		<td><input size="5%" type="text" name="kor1"></td>
		<td><input size="5%" type="text" name="eng1"></td>
		<td><input size="5%" type="text" name="mat1"></td>
		<td><input size="5%" type="text" name="ban1"></td>
		<td><input size="5%" type="text" name="num1"></td>
	</tr>
	<tr>
		<td><input size="5%" type="text" name="name2"></td>
		<td><input size="5%" type="text" name="gen2"></td>
		<td><input size="5%" type="text" name="kor2"></td>
		<td><input size="5%" type="text" name="eng2"></td>
		<td><input size="5%" type="text" name="mat2"></td>
		<td><input size="5%" type="text" name="ban2"></td>
		<td><input size="5%" type="text" name="num2"></td>
	</tr>
	<tr>
		<td><input size="5%" type="text" name="name3"></td>
		<td><input size="5%" type="text" name="gen3"></td>
		<td><input size="5%" type="text" name="kor3"></td>
		<td><input size="5%" type="text" name="eng3"></td>
		<td><input size="5%" type="text" name="mat3"></td>
		<td><input size="5%" type="text" name="ban3"></td>
		<td><input size="5%" type="text" name="num3"></td>
	</tr>
	<tr>
		<td><input size="5%" type="text" name="name4"></td>
		<td><input size="5%" type="text" name="gen4"></td>
		<td><input size="5%" type="text" name="kor4"></td>
		<td><input size="5%" type="text" name="eng4"></td>
		<td><input size="5%" type="text" name="mat4"></td>
		<td><input size="5%" type="text" name="ban4"></td>
		<td><input size="5%" type="text" name="num4"></td>
	</tr>
	<tr>
		<td><input size="5%" type="text" name="name5"></td>
		<td><input size="5%" type="text" name="gen5"></td>
		<td><input size="5%" type="text" name="kor5"></td>
		<td><input size="5%" type="text" name="eng5"></td>
		<td><input size="5%" type="text" name="mat5"></td>
		<td><input size="5%" type="text" name="ban5"></td>
		<td><input size="5%" type="text" name="num5"></td>
	</tr>
	<tr>
	<td><input name="view" type="radio" value="1">성적순</td>
	<td><input name="view" type="radio" value="2">번호순</td>
	<td colspan="2"><input name="view" type="radio" value="3">반번호순</td>
	<td colspan="2"><input name="view" type="radio" value="4">성별등수순</td>
		
		
	
	</tr>
	<tr>
		<td colspan="7" align="center"><input type="submit" value="확인" ></td>
	</tr>
	
	
	
	</table>



</form>
</body>
</html>