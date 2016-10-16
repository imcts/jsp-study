<%@page import="basic.Hobby"%>
<%@page import="basic.StudformList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%

	StudformList sf1 = new StudformList();
	

%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="studReg.jsp" method="post">
	<table border="1" cellpadding="1" cellspacing="1">
		<tr>
			<td>학번</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td>성명</td>
			<td><input type="text" name="name" size="5" maxlength="4"></td>
		</tr>
		<tr>
			<td>성별</td>
			<td>
			
			<%=sf1.get("gender", "radio") %>
			
			
			</td>
		</tr>
		<tr>
			<td>취미</td>
			 <td>
			<%=sf1.get("hobby","checkbox") %>
			</td>
		</tr>
		<tr>
			<td>전화</td>
			 <td>
			 <select name="tel1">
			<%=sf1.select("tel1") %>
			</select>
			-&nbsp;<input type="text" name="tel2" size="5" maxlength="4"> 
			-&nbsp;<input type="text" name="tel3" size="5" maxlength="4"> 
			
			</td>
		</tr>
		
		<tr>
			<td>이메일</td>
			<td>
			<input type="text" name="email1" size="5" maxlength="5"> @ 
			<select name="email2">
			<%=sf1.select("email2") %>
			</select>
			</td>
		</tr>
		<tr>
		<td>하고픈 말</td>
			<td>
				<textarea rows="5" cols="20" name="content"></textarea>
			</td>
		</tr>
		
		
		
		
		
		
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="확인" >
			<input type="reset" value="취소" >
			</td>
		
		</tr>
		
	
	
	</table>
	
	
	
	
	</form>
</body>
</html>