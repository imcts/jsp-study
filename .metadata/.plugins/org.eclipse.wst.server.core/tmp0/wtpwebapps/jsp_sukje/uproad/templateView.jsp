<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="55%">
			<h3 align="center">회원 정보</h3>
			<tr align="center">
				<td width="18%">이름</td>
				<td width="60">${param.name }</td>
				<td rowspan="4" width="145" align="center"><img src="image/${param.photo }"></td> 
			</tr>
			<tr align="center">
				<td>아이디</td>
				<td width="60%">${param.id }</td>
			</tr>
			
			<tr align="center">
				<td>연락처</td>
				<td>${param.tel }</td>
				
			</tr>
			<tr align="center">
				<td>이메일</td>
				<td>${param.mail1 }&nbsp;@&nbsp;${param.mail2 }</td>
			</tr>
			<tr>
				<td align="center">직업</td>
				<td colspan="2">${param.job }</td>
			</tr>
			<tr>
				<td align="center">취미</td>
				<td colspan="2">${param.hobby }</td>  
			</tr>
			<tr align="center">
				<td>이력서</td>
				<td colspan="2" ><a href="down.jsp?sys=${param.iryuksys }&ori=${param.iryukori }">${param.iryukori }</a></td>
			</tr>
		</table>
</body>
</html>