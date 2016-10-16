<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="ct" tagdir="/WEB-INF/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="templateReg.jsp" enctype="multipart/form-data" method="post">
		<table border="1" align="center" width="55%">
			<h3 align="center">회원가입 양식</h3>
			<tr align="center">
				<td width="18%">이름</td>
				<td width="60"><input size="38" type="text" name="name" value="${param.name }">  </td>
				<td rowspan="4" width="145" align="center">사진</td> 
			</tr>
			<tr align="center">
				<td>아이디</td>
				<td width="60"><input type="text" size="38" name="id" value="${param.id }" ></td>
			</tr>
			<tr align="center">
				<td>비밀번호</td>
				<td width="60"><input type="password" size="38" name="pw" > </td>
			</tr>
			<tr align="center">
				<td>연락처</td>
				<td><input size="38" type="text" name="tel" value="${param.tel }"></td>
				
			</tr>
			<tr align="center">
				<td>이메일</td>
				<td><input type="text" name="mail1" value="${param.mail1 }">&nbsp;@<ct:mail var="${param.mail2 }"/> </td>
				<td><input size="1" type="file" name="photo"></td>
			</tr>
			<tr>
				<td align="center">직업</td>
				<td colspan="2"><ct:job var="${param.job }"/></td>
			</tr>
			<tr>
				<td align="center">취미</td>
				<td colspan="2"><ct:hobby var="${param.hobby }"/></td>  
			</tr>
			<tr align="center">
				<td>이력서</td>
				<td colspan="2" ><input size="45" type="file" name="iryuk"></td>
			</tr>
			<tr align="center" >
				<td colspan="3"><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>
</body>
</html>